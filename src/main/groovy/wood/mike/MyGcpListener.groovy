package wood.mike

import io.micronaut.gcp.pubsub.annotation.PubSubListener
import io.micronaut.gcp.pubsub.annotation.Subscription

@PubSubListener
class MyGcpListener {

    @Subscription('words-sub')
    void onMessage(byte[] data) {
        println "Message received ${new String(data)}"
    }

    @Subscription('fish-sub')
    void onFish(Fish fish) {
        println "Fish received ${fish.name}"
    }
}
