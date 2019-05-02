
scalaVersion := "2.12.8"

resolvers += Resolver.sonatypeRepo("public")

// the LaunchDarkly client dependency
libraryDependencies += "com.launchdarkly" % "launchdarkly-java-server-sdk" % "4.6.4"

// Provides a logger implementation; this dependency is not used directly by the LD client
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
