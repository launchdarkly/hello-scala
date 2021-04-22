
scalaVersion := "2.13.5"

resolvers += Resolver.sonatypeRepo("public")

trapExit := false  // this allows the demo to use System.exit(1) to signal an error

// The LaunchDarkly SDK dependency
libraryDependencies += "com.launchdarkly" % "launchdarkly-java-server-sdk" % "[5.0,6.0)"

// Adding slf4j-simple enables the basic console logging implementation of SLF4J. Most real
// applications will use one of the other SLF4J adapters. See: http://www.slf4j.org/
libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.22"
