# LaunchDarkly Sample Scala Application 

We've built a simple console application that demonstrates how to use LaunchDarkly's Java SDK in a Scala application. There isn't a separate Scala SDK. Below, you'll find the basic build procedure, but for more comprehensive instructions, you can visit your [Quickstart page](https://app.launchdarkly.com/quickstart#/) or the [Java SDK reference guide](https://docs.launchdarkly.com/sdk/server-side/java).

Note that this sample application does not use any functional programming frameworks such as [Scalaz](https://github.com/scalaz/scalaz) or [Cats](https://typelevel.org/cats/). Rather, the application exhibits how to use the LaunchDarkly Server-Side SDK for Java in a vanilla Scala application.
 
## Build instructions 

This project uses [SBT](https://www.scala-sbt.org/). It requires that Java is already installed on your system (version 8 or higher). It will automatically use the latest release of the LaunchDarkly SDK with major version 5.

1. Edit `src/main/scala/Hello.scala` and set the value of `sdkKey` to your LaunchDarkly SDK key. If there is an existing boolean feature flag in your LaunchDarkly project that you want to evaluate, set `featureFlagKey` to the flag key.

```scala
  val sdkKey = "1234567890abcdef"

  val featureFlagKey = "my-flag"
```

2. To install the SDK and build the demo: `sbt compile`

3. To run the demo: `sbt run`

You should see the message `"Feature flag '<flag key>' is <true/false> for this user"`.
