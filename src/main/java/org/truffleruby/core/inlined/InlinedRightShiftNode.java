/*
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.core.inlined;

import org.truffleruby.RubyContext;
import org.truffleruby.core.numeric.IntegerNodes.RightShiftNode;
import org.truffleruby.core.numeric.IntegerNodesFactory.RightShiftNodeFactory;
import org.truffleruby.language.dispatch.RubyCallNodeParameters;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;

public abstract class InlinedRightShiftNode extends BinaryInlinedOperationNode {

    @Child RightShiftNode fixnumRightShift;

    public InlinedRightShiftNode(RubyContext context, RubyCallNodeParameters callNodeParameters) {
        super(
                callNodeParameters,
                context.getCoreMethods().integerRightShiftAssumption);
    }

    @Specialization(assumptions = "assumptions")
    protected Object intRightShift(int a, int b) {
        return getRightShiftNode().executeRightShift(a, b);
    }

    @Specialization(assumptions = "assumptions")
    protected Object longRightShift(long a, int b) {
        return getRightShiftNode().executeRightShift(a, b);
    }

    @Specialization
    protected Object fallback(VirtualFrame frame, Object a, Object b) {
        return rewriteAndCall(frame, a, b);
    }

    private RightShiftNode getRightShiftNode() {
        if (fixnumRightShift == null) {
            CompilerDirectives.transferToInterpreterAndInvalidate();
            fixnumRightShift = insert(RightShiftNodeFactory.create(null));
        }
        return fixnumRightShift;
    }

}
