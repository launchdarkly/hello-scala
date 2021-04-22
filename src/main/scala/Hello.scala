
import com.launchdarkly.sdk.LDUser
import com.launchdarkly.sdk.server.LDClient

object Main extends App {
  // Set sdkKey to your LaunchDarkly SDK key.
  val sdkKey = ""

  // Set featureFlagKey to the feature flag key you want to evaluate.
  val featureFlagKey = "my-boolean-flag"

  def showMessage(s: String): Unit = {
    println(s"*** $s")
    println()
  }

  if (sdkKey == "") {
    showMessage("Please edit Hello.scala to set sdkKey to your LaunchDarkly SDK key first")
    System.exit(1)
  }

  val client = new LDClient(sdkKey)

  if (client.isInitialized) {
    showMessage("SDK successfully initialized!")
  } else {
    showMessage("SDK failed to initialize")
    System.exit(1)
  }

  // Set up the user properties. This user should appear on your LaunchDarkly users dashboard
  // soon after you run the demo.
  val user = new LDUser.Builder("example-user-key")
    .name("Sandy")
    .build

  val flagValue = client.boolVariation(featureFlagKey, user, false)

  showMessage(s"Feature flag '$featureFlagKey' is $flagValue for this user")

  // Here we ensure that the SDK shuts down cleanly and has a chance to deliver analytics
  // events to LaunchDarkly before the program exits. If analytics events are not delivered,
  // the user properties and flag usage statistics will not appear on your dashboard. In a
  // normal long-running application, the SDK would continue running and events would be
  // delivered automatically in the background.
  client.close
}
