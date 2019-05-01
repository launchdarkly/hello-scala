// The JavaConversions package sprinkles in some Java/Scala interoperability magic 
// to convert a scala.collection.immutable.List to a java.util.List
import scala.collection.JavaConversions._ 

// Import the LaunchDarkly client
import com.launchdarkly.client.{LDClient, LDUser};

object Main extends App {
   val client = new LDClient("YOUR_SDK_KEY")

   val user = new LDUser.Builder("bob@example.com")
      .firstName("Bob")
      .lastName("Loblaw")
      .customString("groups", List("beta_testers"))
      .build

   val showFeature = client.boolVariation("YOUR_FEATURE_KEY", user, false)

   if (showFeature) {
      println("Showing your feature")
   } else {
      println("Not showing your feature")
   }

   client.flush
   client.close
}
