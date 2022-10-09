load("@io_bazel_rules_groovy//groovy:groovy.bzl", "groovy_binary")

groovy_binary (
    name = "BazelApp",
    srcs = glob(["groovy/**/*.groovy"]),
    main_class = "example.Main",
    deps = [
      "@maven//:org_postgresql_postgresql",
      "@maven//:log4j_log4j",
      "@maven//:org_slf4j_slf4j_api",
      "@maven//:org_slf4j_slf4j_log4j12"
    ],
    resources = ["resources/log4j.xml"],
    visibility = ["//visibility:public"],
)
