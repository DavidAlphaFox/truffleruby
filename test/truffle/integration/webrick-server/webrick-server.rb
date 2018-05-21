# Copyright (c) 2015, 2016 Oracle and/or its affiliates. All rights reserved. This
# code is released under a tri EPL/GPL/LGPL license. You can use it,
# redistribute it and/or modify it under the terms of the:
#
# Eclipse Public License version 1.0, or
# GNU General Public License version 2, or
# GNU Lesser General Public License version 2.1.

require 'webrick'

server = WEBrick::HTTPServer.new(:Port => 14873)

server.mount_proc '/' do |req, res|
  res.body = "Hello, world!\n"
end

server.start
