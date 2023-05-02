# rules_clojure_examples

* This is an example of a using https://github.com/griffinbank/rules_clojure.
* Note that 
    * the aot attribute on clojure_library is mandatory 
    * all clojure targets need to have an explicit dependency on clojure

```bash
$ bazel build //...
INFO: Analyzed 3 targets (0 packages loaded, 0 targets configured).
INFO: Found 3 targets...
INFO: Elapsed time: 0.451s, Critical Path: 0.31s
INFO: 2 processes: 1 internal, 1 worker.
INFO: Build completed successfully, 2 total actions

$ bazel build //src:example 
INFO: Analyzed target //src:example (0 packages loaded, 0 targets configured).
INFO: Found 1 target...
Target //src:example up-to-date:
  bazel-bin/src/example.jar
INFO: Elapsed time: 0.161s, Critical Path: 0.00s
INFO: 1 process: 1 internal.
INFO: Build completed successfully, 1 total action

$ bazel run //coarse:example_coarse_binary 
INFO: Analyzed target //coarse:example_coarse_binary (0 packages loaded, 0 targets configured).
INFO: Found 1 target...
Target //coarse:example_coarse_binary up-to-date:
  bazel-bin/coarse/example_coarse_binary.jar
  bazel-bin/coarse/example_coarse_binary
INFO: Elapsed time: 0.139s, Critical Path: 0.00s
INFO: 1 process: 1 internal.
INFO: Build completed successfully, 1 total action
INFO: Build completed successfully, 1 total action
SPECIAL COARSE VALUE

```
