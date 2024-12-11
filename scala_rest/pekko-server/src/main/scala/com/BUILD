load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_binary(
    name = "server",
    srcs = ["Runner.scala"],
    main_class = "com.Runner",
    deps = [
        "@maven//:org_apache_pekko_pekko_http_core_2_12",
        "@maven//:org_apache_pekko_pekko_http_2_12",
        "@maven//:org_apache_pekko_pekko_actor_2_12_1_1_2",
        "@maven//:org_apache_pekko_pekko_actor_typed_2_12_1_1_2",
        "@maven//:org_apache_pekko_pekko_stream_2_12_1_1_2"
    ]
)