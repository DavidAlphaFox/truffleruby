/*
 * Copyright (c) 2013, 2017 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.language.control;

import com.oracle.truffle.api.frame.VirtualFrame;
import org.truffleruby.language.RubyNode;

public class RetryNode extends RubyNode {

    @Override
    public Object execute(VirtualFrame frame) {
        throw new RetryException();
    }

}
