load("@rules_clojure//:rules.bzl", "clojure_library")

clojure_library(
    name = "example",
    srcs = glob(["*.clj"]),
    aot = ["example-clojure-library"],
    resource_strip_prefix = "src",
    deps = [
         "@maven//:org_clojure_clojure",
         "@maven//:org_clojure_spec_alpha",
         "@maven//:org_clojure_core_specs_alpha",
    ],
)
