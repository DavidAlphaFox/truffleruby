/*
 * Copyright (c) 2015, 2017 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.language.objects.shared;

import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.ImportStatic;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.object.DynamicObject;
import com.oracle.truffle.api.object.ObjectType;
import com.oracle.truffle.api.object.Property;
import com.oracle.truffle.api.object.Shape;
import org.truffleruby.Layouts;
import org.truffleruby.RubyContext;
import org.truffleruby.language.RubyBaseNode;
import org.truffleruby.language.objects.ObjectGraph;
import org.truffleruby.language.objects.ShapeCachingGuards;

import java.util.ArrayList;
import java.util.List;

/**
 * Share the object and all that is reachable from it
 * (see {@link ObjectGraph#getAdjacentObjects(DynamicObject)}.
 */
@ImportStatic(ShapeCachingGuards.class)
public abstract class ShareObjectNode extends RubyBaseNode {

    protected static final int CACHE_LIMIT = 8;

    protected final int depth;

    public ShareObjectNode(int depth) {
        this.depth = depth;
    }

    public abstract void executeShare(DynamicObject object);

    @Specialization(
            guards = "object.getShape() == cachedShape",
            assumptions = "cachedShape.getValidAssumption()",
            limit = "CACHE_LIMIT")
    @ExplodeLoop
    protected void shareCached(DynamicObject object,
            @Cached("ensureSharedClasses(getContext(), object.getShape())") Shape cachedShape,
            @Cached("createShareInternalFieldsNode()") ShareInternalFieldsNode shareInternalFieldsNode,
            @Cached("createReadAndShareFieldNodes(getObjectProperties(cachedShape))") ReadAndShareFieldNode[] readAndShareFieldNodes,
            @Cached("createSharedShape(object)") Shape sharedShape) {
        assert !SharedObjects.isShared(getContext(), cachedShape);

        // Mark the object as shared first to avoid recursion
        object.setShapeAndGrow(cachedShape, sharedShape);

        shareInternalFieldsNode.executeShare(object);

        for (ReadAndShareFieldNode readAndShareFieldNode : readAndShareFieldNodes) {
            readAndShareFieldNode.executeReadFieldAndShare(object);
        }
    }

    @Specialization(guards = "updateShape(object)")
    public void updateShapeAndShare(DynamicObject object) {
        executeShare(object);
    }

    @Specialization(replaces = { "shareCached", "updateShapeAndShare" })
    protected void shareUncached(DynamicObject object) {
        SharedObjects.writeBarrier(getContext(), object);
    }

    protected static Shape ensureSharedClasses(RubyContext context, Shape shape) {
        final ObjectType objectType = shape.getObjectType();
        SharedObjects.writeBarrier(context, Layouts.BASIC_OBJECT.getLogicalClass(objectType));
        SharedObjects.writeBarrier(context, Layouts.BASIC_OBJECT.getMetaClass(objectType));
        return shape;
    }

    private static final Object SOME_OBJECT = new Object();

    protected static List<Property> getObjectProperties(Shape shape) {
        final List<Property> objectProperties = new ArrayList<>();
        // User properties only, ShareInternalFieldsNode do the rest
        for (Property property : shape.getProperties()) {
            if (property.getLocation().canStore(SOME_OBJECT)) {
                objectProperties.add(property);
            }
        }
        return objectProperties;
    }

    protected ShareInternalFieldsNode createShareInternalFieldsNode() {
        return ShareInternalFieldsNodeGen.create(depth);
    }

    protected ReadAndShareFieldNode[] createReadAndShareFieldNodes(List<Property> properties) {
        ReadAndShareFieldNode[] nodes = properties.size() == 0 ? ReadAndShareFieldNode.EMPTY_ARRAY : new ReadAndShareFieldNode[properties.size()];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = ReadAndShareFieldNodeGen.create(properties.get(i), depth);
        }
        return nodes;
    }

    protected static Shape createSharedShape(DynamicObject object) {
        object.updateShape();
        final Shape oldShape = object.getShape();
        return oldShape.makeSharedShape();
    }

}
