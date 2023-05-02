load("@rules_clojure//:rules.bzl", "clojure_library", "clojure_binary")

clojure_library(
    name = "example_coarse_library",
    srcs = glob(["**/*.clj"]),
    aot = ["example-coarse-clojure"],
    resource_strip_prefix = "coarse/src/main/clojure",
    deps = [
         "@maven//:org_clojure_clojure",
         "@maven//:org_clojure_spec_alpha",
         "@maven//:org_clojure_core_specs_alpha",
    ],
)

java_binary(
  name = "example_coarse_binary",
  runtime_deps = [":example_coarse_library"],
  main_class = "example_coarse_clojure"
)


