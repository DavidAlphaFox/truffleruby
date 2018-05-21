# Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved. This
# code is released under a tri EPL/GPL/LGPL license. You can use it,
# redistribute it and/or modify it under the terms of the:
#
# Eclipse Public License version 1.0, or
# GNU General Public License version 2, or
# GNU Lesser General Public License version 2.1.

require_relative '../ruby/spec_helper'

require 'rubygems'

describe "Identifying features such as" do

  it "RUBY_ENGINE is 'truffleruby'" do
    RUBY_ENGINE.should == 'truffleruby'
  end

  it 'RUBY_VERSION matches /\A\d+\.\d+\.\d+\z/' do
    RUBY_VERSION.should =~ /\A\d+\.\d+\.\d+\z/
  end

  it 'RUBY_ENGINE_VERSION matches /\A\d+(\.\d+)*(-rc\d+)?(\-dev)?(-\h+)?\z/' do
    RUBY_ENGINE_VERSION.should =~ /\A\d+(\.\d+)*(-rc\d+)?(\-dev)?(-\h+)?\z/
  end

  it "RUBY_ENGINE_VERSION can be parsed as a Gem::Version" do
    Gem::Version.new(RUBY_ENGINE_VERSION).should be_kind_of(Gem::Version)
  end

  it "RUBY_PATCHLEVEL is 0" do
    RUBY_PATCHLEVEL.should == 0
  end

  it "RUBY_RELEASE_DATE is the current year" do
    year = Time.now.year
    ((year-1..year) === RUBY_RELEASE_DATE.to_i).should be_true
  end

  it "Gem.ruby_engine matches RUBY_ENGINE" do
    Gem.ruby_engine.should == RUBY_ENGINE
  end

  it "Gem.ruby_version matches RUBY_VERSION as a Gem version object" do
    Gem.ruby_version.should == Gem::Version.new(RUBY_VERSION)
  end

  it "RbConfig::CONFIG['ruby_install_name'] is 'truffleruby'" do
    RbConfig::CONFIG['ruby_install_name'].should == 'truffleruby'
  end

  it "RbConfig::CONFIG['RUBY_INSTALL_NAME'] is 'truffleruby'" do
    RbConfig::CONFIG['RUBY_INSTALL_NAME'].should == 'truffleruby'
  end

  it "RbConfig::CONFIG['ruby_version'] matches RUBY_VERSION except with the minor always being zero" do
    RbConfig::CONFIG['ruby_version'].should == RUBY_VERSION.sub(/\.(\d+)\z/, '.0')
  end

  it "RbConfig::CONFIG['RUBY_BASE_NAME'] is 'ruby'" do
    RbConfig::CONFIG['RUBY_BASE_NAME'].should == 'ruby'
  end

  it 'TruffleRuby.revision matches /\A\h+\z/' do
    TruffleRuby.revision.should =~ /\A\h+\z/
  end

  describe "the Rubinius module" do

    it "is not defined" do
      defined?(Rubinius).should be_nil
    end
    
  end

  describe "the RubySL module" do

    before :all do
      # Require something that uses code from RubySL
      require 'stringio'
    end

    it "is not defined" do
      defined?(RubySL).should be_nil
    end
    
  end

end
