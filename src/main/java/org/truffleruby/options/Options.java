/*
 * Copyright (c) 2016, 2023 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 2.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.options;

// GENERATED BY tool/generate-options.rb
// This file is automatically generated from options.yml with 'jt build options'

import org.graalvm.options.OptionDescriptor;
import org.graalvm.options.OptionValues;
import org.truffleruby.shared.options.OptionsCatalog;
import org.truffleruby.shared.options.Verbosity;
import org.truffleruby.shared.options.Profile;
import org.truffleruby.shared.options.OutputFormat;

import com.oracle.truffle.api.TruffleLanguage.Env;

// @formatter:off
// Checkstyle: stop
public final class Options {

    /** --load-paths=StringArrayOptionType.EMPTY_STRING_ARRAY */
    public final String[] LOAD_PATHS;
    /** --required-libraries=StringArrayOptionType.EMPTY_STRING_ARRAY */
    public final String[] REQUIRED_LIBRARIES;
    /** --working-directory="." */
    public final String WORKING_DIRECTORY;
    /** --debug=false */
    public final boolean DEBUG;
    /** --verbose=Verbosity.FALSE */
    public final Verbosity VERBOSITY;
    /** --source-encoding="UTF-8" */
    public final String SOURCE_ENCODING;
    /** --internal-encoding="" */
    public final String INTERNAL_ENCODING;
    /** --external-encoding="" */
    public final String EXTERNAL_ENCODING;
    /** --backtrace-limit=-1 */
    public final int BACKTRACE_LIMIT;
    /** --launcher="" */
    public final String LAUNCHER;
    /** --rubygems=true */
    public final boolean RUBYGEMS;
    /** --did-you-mean=true */
    public final boolean DID_YOU_MEAN;
    /** --lazy-rubygems=RUBYGEMS && DEFAULT_LAZY */
    public final boolean LAZY_RUBYGEMS;
    /** --embedded=true */
    public final boolean EMBEDDED;
    /** --platform-native=env.isNativeAccessAllowed() && true */
    public final boolean NATIVE_PLATFORM;
    /** --platform-native-interrupt=NATIVE_PLATFORM */
    public final boolean NATIVE_INTERRUPT;
    /** --platform-handle-interrupt=!EMBEDDED */
    public final boolean HANDLE_INTERRUPT;
    /** --single-threaded=!env.isCreateThreadAllowed() || EMBEDDED */
    public final boolean SINGLE_THREADED;
    /** --polyglot-stdio=EMBEDDED || !NATIVE_PLATFORM */
    public final boolean POLYGLOT_STDIO;
    /** --interop-host=env.isHostLookupAllowed() && true */
    public final boolean HOST_INTEROP;
    /** --trace-calls=true */
    public final boolean TRACE_CALLS;
    /** --pattern-matching=false */
    public final boolean PATTERN_MATCHING;
    /** --patching=true */
    public final boolean PATCHING;
    /** --hashing-deterministic=false */
    public final boolean HASHING_DETERMINISTIC;
    /** --virtual-thread-fibers=false */
    public final boolean VIRTUAL_THREAD_FIBERS;
    /** --log-subprocess=false */
    public final boolean LOG_SUBPROCESS;
    /** --warn-locale=true */
    public final boolean WARN_LOCALE;
    /** --exceptions-store-java=false */
    public final boolean EXCEPTIONS_STORE_JAVA;
    /** --exceptions-print-java=false */
    public final boolean EXCEPTIONS_PRINT_JAVA;
    /** --exceptions-print-uncaught-java=false */
    public final boolean EXCEPTIONS_PRINT_UNCAUGHT_JAVA;
    /** --exceptions-print-ruby-for-java=false */
    public final boolean EXCEPTIONS_PRINT_RUBY_FOR_JAVA;
    /** --exceptions-warn-stackoverflow=true */
    public final boolean EXCEPTIONS_WARN_STACKOVERFLOW;
    /** --exceptions-warn-out-of-memory=true */
    public final boolean EXCEPTIONS_WARN_OUT_OF_MEMORY;
    /** --backtraces-interleave-java=false */
    public final boolean BACKTRACES_INTERLEAVE_JAVA;
    /** --buckets-big-hash=false */
    public final boolean BIG_HASH_STRATEGY;
    /** --backtraces-on-interrupt=false */
    public final boolean BACKTRACE_ON_INTERRUPT;
    /** --backtraces-sigalrm=!EMBEDDED */
    public final boolean BACKTRACE_ON_SIGALRM;
    /** --backtraces-raise=false */
    public final boolean BACKTRACE_ON_RAISE;
    /** --backtraces-rescue=false */
    public final boolean BACKTRACE_ON_RESCUE;
    /** --backtraces-new-thread=false */
    public final boolean BACKTRACE_ON_NEW_THREAD;
    /** --backtraces-new-fiber=false */
    public final boolean BACKTRACE_ON_NEW_FIBER;
    /** --cexts=true */
    public final boolean CEXTS;
    /** --cexts-lock=true */
    public final boolean CEXT_LOCK;
    /** --cexts-prepend-toolchain-to-path=true */
    public final boolean CEXTS_PREPEND_TOOLCHAIN_TO_PATH;
    /** --options-log=false */
    public final boolean OPTIONS_LOG;
    /** --log-load=false */
    public final boolean LOG_LOAD;
    /** --log-autoload=false */
    public final boolean LOG_AUTOLOAD;
    /** --log-feature-location=false */
    public final boolean LOG_FEATURE_LOCATION;
    /** --metrics-profile-require=Profile.NONE */
    public final Profile METRICS_PROFILE_REQUIRE;
    /** --cexts-log-load=false */
    public final boolean CEXTS_LOG_LOAD;
    /** --cexts-log-warnings=false */
    public final boolean CEXTS_LOG_WARNINGS;
    /** --warn-deprecated=false */
    public final boolean WARN_DEPRECATED;
    /** --warn-experimental=true */
    public final boolean WARN_EXPERIMENTAL;
    /** --warn-performance=false */
    public final boolean WARN_PERFORMANCE;
    /** --use-truffle-regex=true */
    public final boolean USE_TRUFFLE_REGEX;
    /** --warn-truffle-regex-compile-fallback=false */
    public final boolean WARN_TRUFFLE_REGEX_COMPILE_FALLBACK;
    /** --warn-truffle-regex-match-fallback=false */
    public final boolean WARN_TRUFFLE_REGEX_MATCH_FALLBACK;
    /** --truffle-regex-ignore-atomic-groups=false */
    public final boolean TRUFFLE_REGEX_IGNORE_ATOMIC_GROUPS;
    /** --argv-globals=false */
    public final boolean ARGV_GLOBALS;
    /** --chomp-loop=false */
    public final boolean CHOMP_LOOP;
    /** --gets-loop=false */
    public final boolean GETS_LOOP;
    /** --print-loop=false */
    public final boolean PRINT_LOOP;
    /** --split-loop=false */
    public final boolean SPLIT_LOOP;
    /** --ignore-lines-before-ruby-shebang=false */
    public final boolean IGNORE_LINES_BEFORE_RUBY_SHEBANG;
    /** --syntax-check=false */
    public final boolean SYNTAX_CHECK;
    /** --argv-global-values=StringArrayOptionType.EMPTY_STRING_ARRAY */
    public final String[] ARGV_GLOBAL_VALUES;
    /** --argv-global-flags=StringArrayOptionType.EMPTY_STRING_ARRAY */
    public final String[] ARGV_GLOBAL_FLAGS;
    /** --building-core-cexts=false */
    public final boolean BUILDING_CORE_CEXTS;
    /** --log-pending-interrupts=false */
    public final boolean LOG_PENDING_INTERRUPTS;
    /** --print-interned-tstring-stats=false */
    public final boolean PRINT_INTERNED_TSTRING_STATS;
    /** --cexts-to-native-stats=false */
    public final boolean CEXTS_TO_NATIVE_STATS;
    /** --cexts-to-native-count=CEXTS_TO_NATIVE_STATS */
    public final boolean CEXTS_TO_NATIVE_COUNT;
    /** --backtraces-to-native=false */
    public final boolean BACKTRACE_ON_TO_NATIVE;
    /** --keep-handles-alive=false */
    public final boolean CEXTS_KEEP_HANDLES_ALIVE;
    /** --cexts-sulong=false */
    public final boolean CEXTS_SULONG;
    /** --basic-ops-log-rewrite=false */
    public final boolean BASICOPS_LOG_REWRITE;
    /** --array-small=3 */
    public final int ARRAY_SMALL;
    /** --cexts-marking-cache=100 */
    public final int CEXTS_MARKING_CACHE;
    /** --global-variable-max-invalidations=1 */
    public final int GLOBAL_VARIABLE_MAX_INVALIDATIONS;
    /** --clone-default=true */
    public final boolean CLONE_DEFAULT;
    /** --inline-default=true */
    public final boolean INLINE_DEFAULT;
    /** --core-always-clone=false */
    public final boolean CORE_ALWAYS_CLONE;
    /** --always-split-honor=CLONE_DEFAULT */
    public final boolean ALWAYS_SPLIT_HONOR;
    /** --never-split-honor=true */
    public final boolean NEVER_SPLIT_HONOR;
    /** --yield-always-inline=INLINE_DEFAULT */
    public final boolean YIELD_ALWAYS_INLINE;
    /** --method-missing-always-clone=CLONE_DEFAULT */
    public final boolean METHODMISSING_ALWAYS_CLONE;
    /** --method-missing-always-inline=INLINE_DEFAULT */
    public final boolean METHODMISSING_ALWAYS_INLINE;
    /** --regexp-instrument-match=false */
    public final boolean REGEXP_INSTRUMENT_MATCH;
    /** --regexp-instrument-match-detailed=false */
    public final boolean REGEXP_INSTRUMENT_MATCH_DETAILED;
    /** --regexp-instrumentation-output-format=OutputFormat.TEXT */
    public final OutputFormat REGEXP_INSTRUMENT_OUTPUT_FORMAT;
    /** --metrics-time-parsing-file=false */
    public final boolean METRICS_TIME_PARSING_FILE;
    /** --metrics-time-require=false */
    public final boolean METRICS_TIME_REQUIRE;
    /** --testing-rubygems=false */
    public final boolean TESTING_RUBYGEMS;
    /** --compare-regex-engines=false */
    public final boolean COMPARE_REGEX_ENGINES;

    public Options(Env env, OptionValues options, LanguageOptions languageOptions) {
        LOAD_PATHS = options.get(OptionsCatalog.LOAD_PATHS_KEY);
        REQUIRED_LIBRARIES = options.get(OptionsCatalog.REQUIRED_LIBRARIES_KEY);
        WORKING_DIRECTORY = options.get(OptionsCatalog.WORKING_DIRECTORY_KEY);
        DEBUG = options.get(OptionsCatalog.DEBUG_KEY);
        VERBOSITY = options.get(OptionsCatalog.VERBOSITY_KEY);
        SOURCE_ENCODING = options.get(OptionsCatalog.SOURCE_ENCODING_KEY);
        INTERNAL_ENCODING = options.get(OptionsCatalog.INTERNAL_ENCODING_KEY);
        EXTERNAL_ENCODING = options.get(OptionsCatalog.EXTERNAL_ENCODING_KEY);
        BACKTRACE_LIMIT = options.get(OptionsCatalog.BACKTRACE_LIMIT_KEY);
        LAUNCHER = options.get(OptionsCatalog.LAUNCHER_KEY);
        RUBYGEMS = options.get(OptionsCatalog.RUBYGEMS_KEY);
        DID_YOU_MEAN = options.get(OptionsCatalog.DID_YOU_MEAN_KEY);
        LAZY_RUBYGEMS = RUBYGEMS && (options.hasBeenSet(OptionsCatalog.LAZY_RUBYGEMS_KEY) ? options.get(OptionsCatalog.LAZY_RUBYGEMS_KEY) : languageOptions.DEFAULT_LAZY);
        EMBEDDED = options.get(OptionsCatalog.EMBEDDED_KEY);
        NATIVE_PLATFORM = env.isNativeAccessAllowed() && (options.get(OptionsCatalog.NATIVE_PLATFORM_KEY));
        NATIVE_INTERRUPT = options.hasBeenSet(OptionsCatalog.NATIVE_INTERRUPT_KEY) ? options.get(OptionsCatalog.NATIVE_INTERRUPT_KEY) : NATIVE_PLATFORM;
        HANDLE_INTERRUPT = options.hasBeenSet(OptionsCatalog.HANDLE_INTERRUPT_KEY) ? options.get(OptionsCatalog.HANDLE_INTERRUPT_KEY) : !EMBEDDED;
        SINGLE_THREADED = !env.isCreateThreadAllowed() || (options.hasBeenSet(OptionsCatalog.SINGLE_THREADED_KEY) ? options.get(OptionsCatalog.SINGLE_THREADED_KEY) : EMBEDDED);
        POLYGLOT_STDIO = options.hasBeenSet(OptionsCatalog.POLYGLOT_STDIO_KEY) ? options.get(OptionsCatalog.POLYGLOT_STDIO_KEY) : EMBEDDED || !NATIVE_PLATFORM;
        HOST_INTEROP = env.isHostLookupAllowed() && (options.get(OptionsCatalog.HOST_INTEROP_KEY));
        TRACE_CALLS = options.get(OptionsCatalog.TRACE_CALLS_KEY);
        PATTERN_MATCHING = options.get(OptionsCatalog.PATTERN_MATCHING_KEY);
        PATCHING = options.get(OptionsCatalog.PATCHING_KEY);
        HASHING_DETERMINISTIC = options.get(OptionsCatalog.HASHING_DETERMINISTIC_KEY);
        VIRTUAL_THREAD_FIBERS = options.get(OptionsCatalog.VIRTUAL_THREAD_FIBERS_KEY);
        LOG_SUBPROCESS = options.get(OptionsCatalog.LOG_SUBPROCESS_KEY);
        WARN_LOCALE = options.get(OptionsCatalog.WARN_LOCALE_KEY);
        EXCEPTIONS_STORE_JAVA = options.get(OptionsCatalog.EXCEPTIONS_STORE_JAVA_KEY);
        EXCEPTIONS_PRINT_JAVA = options.get(OptionsCatalog.EXCEPTIONS_PRINT_JAVA_KEY);
        EXCEPTIONS_PRINT_UNCAUGHT_JAVA = options.get(OptionsCatalog.EXCEPTIONS_PRINT_UNCAUGHT_JAVA_KEY);
        EXCEPTIONS_PRINT_RUBY_FOR_JAVA = options.get(OptionsCatalog.EXCEPTIONS_PRINT_RUBY_FOR_JAVA_KEY);
        EXCEPTIONS_WARN_STACKOVERFLOW = options.get(OptionsCatalog.EXCEPTIONS_WARN_STACKOVERFLOW_KEY);
        EXCEPTIONS_WARN_OUT_OF_MEMORY = options.get(OptionsCatalog.EXCEPTIONS_WARN_OUT_OF_MEMORY_KEY);
        BACKTRACES_INTERLEAVE_JAVA = options.get(OptionsCatalog.BACKTRACES_INTERLEAVE_JAVA_KEY);
        BIG_HASH_STRATEGY = options.get(OptionsCatalog.BIG_HASH_STRATEGY_KEY);
        BACKTRACE_ON_INTERRUPT = options.get(OptionsCatalog.BACKTRACE_ON_INTERRUPT_KEY);
        BACKTRACE_ON_SIGALRM = options.hasBeenSet(OptionsCatalog.BACKTRACE_ON_SIGALRM_KEY) ? options.get(OptionsCatalog.BACKTRACE_ON_SIGALRM_KEY) : !EMBEDDED;
        BACKTRACE_ON_RAISE = options.get(OptionsCatalog.BACKTRACE_ON_RAISE_KEY);
        BACKTRACE_ON_RESCUE = options.get(OptionsCatalog.BACKTRACE_ON_RESCUE_KEY);
        BACKTRACE_ON_NEW_THREAD = options.get(OptionsCatalog.BACKTRACE_ON_NEW_THREAD_KEY);
        BACKTRACE_ON_NEW_FIBER = options.get(OptionsCatalog.BACKTRACE_ON_NEW_FIBER_KEY);
        CEXTS = options.get(OptionsCatalog.CEXTS_KEY);
        CEXT_LOCK = options.get(OptionsCatalog.CEXT_LOCK_KEY);
        CEXTS_PREPEND_TOOLCHAIN_TO_PATH = options.get(OptionsCatalog.CEXTS_PREPEND_TOOLCHAIN_TO_PATH_KEY);
        OPTIONS_LOG = options.get(OptionsCatalog.OPTIONS_LOG_KEY);
        LOG_LOAD = options.get(OptionsCatalog.LOG_LOAD_KEY);
        LOG_AUTOLOAD = options.get(OptionsCatalog.LOG_AUTOLOAD_KEY);
        LOG_FEATURE_LOCATION = options.get(OptionsCatalog.LOG_FEATURE_LOCATION_KEY);
        METRICS_PROFILE_REQUIRE = options.get(OptionsCatalog.METRICS_PROFILE_REQUIRE_KEY);
        CEXTS_LOG_LOAD = options.get(OptionsCatalog.CEXTS_LOG_LOAD_KEY);
        CEXTS_LOG_WARNINGS = options.get(OptionsCatalog.CEXTS_LOG_WARNINGS_KEY);
        WARN_DEPRECATED = options.get(OptionsCatalog.WARN_DEPRECATED_KEY);
        WARN_EXPERIMENTAL = options.get(OptionsCatalog.WARN_EXPERIMENTAL_KEY);
        WARN_PERFORMANCE = options.get(OptionsCatalog.WARN_PERFORMANCE_KEY);
        USE_TRUFFLE_REGEX = options.get(OptionsCatalog.USE_TRUFFLE_REGEX_KEY);
        WARN_TRUFFLE_REGEX_COMPILE_FALLBACK = options.get(OptionsCatalog.WARN_TRUFFLE_REGEX_COMPILE_FALLBACK_KEY);
        WARN_TRUFFLE_REGEX_MATCH_FALLBACK = options.get(OptionsCatalog.WARN_TRUFFLE_REGEX_MATCH_FALLBACK_KEY);
        TRUFFLE_REGEX_IGNORE_ATOMIC_GROUPS = options.get(OptionsCatalog.TRUFFLE_REGEX_IGNORE_ATOMIC_GROUPS_KEY);
        ARGV_GLOBALS = options.get(OptionsCatalog.ARGV_GLOBALS_KEY);
        CHOMP_LOOP = options.get(OptionsCatalog.CHOMP_LOOP_KEY);
        GETS_LOOP = options.get(OptionsCatalog.GETS_LOOP_KEY);
        PRINT_LOOP = options.get(OptionsCatalog.PRINT_LOOP_KEY);
        SPLIT_LOOP = options.get(OptionsCatalog.SPLIT_LOOP_KEY);
        IGNORE_LINES_BEFORE_RUBY_SHEBANG = options.get(OptionsCatalog.IGNORE_LINES_BEFORE_RUBY_SHEBANG_KEY);
        SYNTAX_CHECK = options.get(OptionsCatalog.SYNTAX_CHECK_KEY);
        ARGV_GLOBAL_VALUES = options.get(OptionsCatalog.ARGV_GLOBAL_VALUES_KEY);
        ARGV_GLOBAL_FLAGS = options.get(OptionsCatalog.ARGV_GLOBAL_FLAGS_KEY);
        BUILDING_CORE_CEXTS = options.get(OptionsCatalog.BUILDING_CORE_CEXTS_KEY);
        LOG_PENDING_INTERRUPTS = options.get(OptionsCatalog.LOG_PENDING_INTERRUPTS_KEY);
        PRINT_INTERNED_TSTRING_STATS = options.get(OptionsCatalog.PRINT_INTERNED_TSTRING_STATS_KEY);
        CEXTS_TO_NATIVE_STATS = options.get(OptionsCatalog.CEXTS_TO_NATIVE_STATS_KEY);
        CEXTS_TO_NATIVE_COUNT = options.hasBeenSet(OptionsCatalog.CEXTS_TO_NATIVE_COUNT_KEY) ? options.get(OptionsCatalog.CEXTS_TO_NATIVE_COUNT_KEY) : CEXTS_TO_NATIVE_STATS;
        BACKTRACE_ON_TO_NATIVE = options.get(OptionsCatalog.BACKTRACE_ON_TO_NATIVE_KEY);
        CEXTS_KEEP_HANDLES_ALIVE = options.get(OptionsCatalog.CEXTS_KEEP_HANDLES_ALIVE_KEY);
        CEXTS_SULONG = options.get(OptionsCatalog.CEXTS_SULONG_KEY);
        BASICOPS_LOG_REWRITE = options.get(OptionsCatalog.BASICOPS_LOG_REWRITE_KEY);
        ARRAY_SMALL = options.get(OptionsCatalog.ARRAY_SMALL_KEY);
        CEXTS_MARKING_CACHE = options.get(OptionsCatalog.CEXTS_MARKING_CACHE_KEY);
        GLOBAL_VARIABLE_MAX_INVALIDATIONS = options.get(OptionsCatalog.GLOBAL_VARIABLE_MAX_INVALIDATIONS_KEY);
        CLONE_DEFAULT = options.get(OptionsCatalog.CLONE_DEFAULT_KEY);
        INLINE_DEFAULT = options.get(OptionsCatalog.INLINE_DEFAULT_KEY);
        CORE_ALWAYS_CLONE = options.get(OptionsCatalog.CORE_ALWAYS_CLONE_KEY);
        ALWAYS_SPLIT_HONOR = options.hasBeenSet(OptionsCatalog.ALWAYS_SPLIT_HONOR_KEY) ? options.get(OptionsCatalog.ALWAYS_SPLIT_HONOR_KEY) : CLONE_DEFAULT;
        NEVER_SPLIT_HONOR = options.get(OptionsCatalog.NEVER_SPLIT_HONOR_KEY);
        YIELD_ALWAYS_INLINE = options.hasBeenSet(OptionsCatalog.YIELD_ALWAYS_INLINE_KEY) ? options.get(OptionsCatalog.YIELD_ALWAYS_INLINE_KEY) : INLINE_DEFAULT;
        METHODMISSING_ALWAYS_CLONE = options.hasBeenSet(OptionsCatalog.METHODMISSING_ALWAYS_CLONE_KEY) ? options.get(OptionsCatalog.METHODMISSING_ALWAYS_CLONE_KEY) : CLONE_DEFAULT;
        METHODMISSING_ALWAYS_INLINE = options.hasBeenSet(OptionsCatalog.METHODMISSING_ALWAYS_INLINE_KEY) ? options.get(OptionsCatalog.METHODMISSING_ALWAYS_INLINE_KEY) : INLINE_DEFAULT;
        REGEXP_INSTRUMENT_MATCH = options.get(OptionsCatalog.REGEXP_INSTRUMENT_MATCH_KEY);
        REGEXP_INSTRUMENT_MATCH_DETAILED = options.get(OptionsCatalog.REGEXP_INSTRUMENT_MATCH_DETAILED_KEY);
        REGEXP_INSTRUMENT_OUTPUT_FORMAT = options.get(OptionsCatalog.REGEXP_INSTRUMENT_OUTPUT_FORMAT_KEY);
        METRICS_TIME_PARSING_FILE = options.get(OptionsCatalog.METRICS_TIME_PARSING_FILE_KEY);
        METRICS_TIME_REQUIRE = options.get(OptionsCatalog.METRICS_TIME_REQUIRE_KEY);
        TESTING_RUBYGEMS = options.get(OptionsCatalog.TESTING_RUBYGEMS_KEY);
        COMPARE_REGEX_ENGINES = options.get(OptionsCatalog.COMPARE_REGEX_ENGINES_KEY);
    }

    public Object fromDescriptor(OptionDescriptor descriptor) {
        switch (descriptor.getName()) {
            case "ruby.load-paths":
                return LOAD_PATHS;
            case "ruby.required-libraries":
                return REQUIRED_LIBRARIES;
            case "ruby.working-directory":
                return WORKING_DIRECTORY;
            case "ruby.debug":
                return DEBUG;
            case "ruby.verbose":
                return VERBOSITY;
            case "ruby.source-encoding":
                return SOURCE_ENCODING;
            case "ruby.internal-encoding":
                return INTERNAL_ENCODING;
            case "ruby.external-encoding":
                return EXTERNAL_ENCODING;
            case "ruby.backtrace-limit":
                return BACKTRACE_LIMIT;
            case "ruby.launcher":
                return LAUNCHER;
            case "ruby.rubygems":
                return RUBYGEMS;
            case "ruby.did-you-mean":
                return DID_YOU_MEAN;
            case "ruby.lazy-rubygems":
                return LAZY_RUBYGEMS;
            case "ruby.embedded":
                return EMBEDDED;
            case "ruby.platform-native":
                return NATIVE_PLATFORM;
            case "ruby.platform-native-interrupt":
                return NATIVE_INTERRUPT;
            case "ruby.platform-handle-interrupt":
                return HANDLE_INTERRUPT;
            case "ruby.single-threaded":
                return SINGLE_THREADED;
            case "ruby.polyglot-stdio":
                return POLYGLOT_STDIO;
            case "ruby.interop-host":
                return HOST_INTEROP;
            case "ruby.trace-calls":
                return TRACE_CALLS;
            case "ruby.pattern-matching":
                return PATTERN_MATCHING;
            case "ruby.patching":
                return PATCHING;
            case "ruby.hashing-deterministic":
                return HASHING_DETERMINISTIC;
            case "ruby.virtual-thread-fibers":
                return VIRTUAL_THREAD_FIBERS;
            case "ruby.log-subprocess":
                return LOG_SUBPROCESS;
            case "ruby.warn-locale":
                return WARN_LOCALE;
            case "ruby.exceptions-store-java":
                return EXCEPTIONS_STORE_JAVA;
            case "ruby.exceptions-print-java":
                return EXCEPTIONS_PRINT_JAVA;
            case "ruby.exceptions-print-uncaught-java":
                return EXCEPTIONS_PRINT_UNCAUGHT_JAVA;
            case "ruby.exceptions-print-ruby-for-java":
                return EXCEPTIONS_PRINT_RUBY_FOR_JAVA;
            case "ruby.exceptions-warn-stackoverflow":
                return EXCEPTIONS_WARN_STACKOVERFLOW;
            case "ruby.exceptions-warn-out-of-memory":
                return EXCEPTIONS_WARN_OUT_OF_MEMORY;
            case "ruby.backtraces-interleave-java":
                return BACKTRACES_INTERLEAVE_JAVA;
            case "ruby.buckets-big-hash":
                return BIG_HASH_STRATEGY;
            case "ruby.backtraces-on-interrupt":
                return BACKTRACE_ON_INTERRUPT;
            case "ruby.backtraces-sigalrm":
                return BACKTRACE_ON_SIGALRM;
            case "ruby.backtraces-raise":
                return BACKTRACE_ON_RAISE;
            case "ruby.backtraces-rescue":
                return BACKTRACE_ON_RESCUE;
            case "ruby.backtraces-new-thread":
                return BACKTRACE_ON_NEW_THREAD;
            case "ruby.backtraces-new-fiber":
                return BACKTRACE_ON_NEW_FIBER;
            case "ruby.cexts":
                return CEXTS;
            case "ruby.cexts-lock":
                return CEXT_LOCK;
            case "ruby.cexts-prepend-toolchain-to-path":
                return CEXTS_PREPEND_TOOLCHAIN_TO_PATH;
            case "ruby.options-log":
                return OPTIONS_LOG;
            case "ruby.log-load":
                return LOG_LOAD;
            case "ruby.log-autoload":
                return LOG_AUTOLOAD;
            case "ruby.log-feature-location":
                return LOG_FEATURE_LOCATION;
            case "ruby.metrics-profile-require":
                return METRICS_PROFILE_REQUIRE;
            case "ruby.cexts-log-load":
                return CEXTS_LOG_LOAD;
            case "ruby.cexts-log-warnings":
                return CEXTS_LOG_WARNINGS;
            case "ruby.warn-deprecated":
                return WARN_DEPRECATED;
            case "ruby.warn-experimental":
                return WARN_EXPERIMENTAL;
            case "ruby.warn-performance":
                return WARN_PERFORMANCE;
            case "ruby.use-truffle-regex":
                return USE_TRUFFLE_REGEX;
            case "ruby.warn-truffle-regex-compile-fallback":
                return WARN_TRUFFLE_REGEX_COMPILE_FALLBACK;
            case "ruby.warn-truffle-regex-match-fallback":
                return WARN_TRUFFLE_REGEX_MATCH_FALLBACK;
            case "ruby.truffle-regex-ignore-atomic-groups":
                return TRUFFLE_REGEX_IGNORE_ATOMIC_GROUPS;
            case "ruby.argv-globals":
                return ARGV_GLOBALS;
            case "ruby.chomp-loop":
                return CHOMP_LOOP;
            case "ruby.gets-loop":
                return GETS_LOOP;
            case "ruby.print-loop":
                return PRINT_LOOP;
            case "ruby.split-loop":
                return SPLIT_LOOP;
            case "ruby.ignore-lines-before-ruby-shebang":
                return IGNORE_LINES_BEFORE_RUBY_SHEBANG;
            case "ruby.syntax-check":
                return SYNTAX_CHECK;
            case "ruby.argv-global-values":
                return ARGV_GLOBAL_VALUES;
            case "ruby.argv-global-flags":
                return ARGV_GLOBAL_FLAGS;
            case "ruby.building-core-cexts":
                return BUILDING_CORE_CEXTS;
            case "ruby.log-pending-interrupts":
                return LOG_PENDING_INTERRUPTS;
            case "ruby.print-interned-tstring-stats":
                return PRINT_INTERNED_TSTRING_STATS;
            case "ruby.cexts-to-native-stats":
                return CEXTS_TO_NATIVE_STATS;
            case "ruby.cexts-to-native-count":
                return CEXTS_TO_NATIVE_COUNT;
            case "ruby.backtraces-to-native":
                return BACKTRACE_ON_TO_NATIVE;
            case "ruby.keep-handles-alive":
                return CEXTS_KEEP_HANDLES_ALIVE;
            case "ruby.cexts-sulong":
                return CEXTS_SULONG;
            case "ruby.basic-ops-log-rewrite":
                return BASICOPS_LOG_REWRITE;
            case "ruby.array-small":
                return ARRAY_SMALL;
            case "ruby.cexts-marking-cache":
                return CEXTS_MARKING_CACHE;
            case "ruby.global-variable-max-invalidations":
                return GLOBAL_VARIABLE_MAX_INVALIDATIONS;
            case "ruby.clone-default":
                return CLONE_DEFAULT;
            case "ruby.inline-default":
                return INLINE_DEFAULT;
            case "ruby.core-always-clone":
                return CORE_ALWAYS_CLONE;
            case "ruby.always-split-honor":
                return ALWAYS_SPLIT_HONOR;
            case "ruby.never-split-honor":
                return NEVER_SPLIT_HONOR;
            case "ruby.yield-always-inline":
                return YIELD_ALWAYS_INLINE;
            case "ruby.method-missing-always-clone":
                return METHODMISSING_ALWAYS_CLONE;
            case "ruby.method-missing-always-inline":
                return METHODMISSING_ALWAYS_INLINE;
            case "ruby.regexp-instrument-match":
                return REGEXP_INSTRUMENT_MATCH;
            case "ruby.regexp-instrument-match-detailed":
                return REGEXP_INSTRUMENT_MATCH_DETAILED;
            case "ruby.regexp-instrumentation-output-format":
                return REGEXP_INSTRUMENT_OUTPUT_FORMAT;
            case "ruby.metrics-time-parsing-file":
                return METRICS_TIME_PARSING_FILE;
            case "ruby.metrics-time-require":
                return METRICS_TIME_REQUIRE;
            case "ruby.testing-rubygems":
                return TESTING_RUBYGEMS;
            case "ruby.compare-regex-engines":
                return COMPARE_REGEX_ENGINES;
            default:
                return null;
        }
    }

}
// Checkstyle: resume
// @formatter:on
