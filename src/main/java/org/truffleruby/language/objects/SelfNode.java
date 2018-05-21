/*
 * Copyright (c) 2013, 2017 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.language.objects;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.object.HiddenKey;
import org.truffleruby.language.RubyNode;
import org.truffleruby.language.locals.ReadFrameSlotNode;
import org.truffleruby.language.locals.ReadFrameSlotNodeGen;

public class SelfNode extends RubyNode {

    public static final HiddenKey SELF_IDENTIFIER = new HiddenKey("(self)");

    private final FrameSlot selfSlot;

    @Child private ReadFrameSlotNode readSelfSlotNode;

    public SelfNode(FrameDescriptor frameDescriptor) {
        this.selfSlot = frameDescriptor.findOrAddFrameSlot(SelfNode.SELF_IDENTIFIER);
    }

    @Override
    public Object execute(VirtualFrame frame) {
        if (readSelfSlotNode == null) {
            CompilerDirectives.transferToInterpreterAndInvalidate();
            readSelfSlotNode = insert(ReadFrameSlotNodeGen.create(selfSlot));
        }

        return readSelfSlotNode.executeRead(frame);
    }

    @Override
    public Object isDefined(VirtualFrame frame) {
        return coreStrings().SELF.createInstance();
    }

}
