package wood.mike

import io.micronaut.gcp.pubsub.annotation.PubSubListener
import io.micronaut.gcp.pubsub.annotation.Subscription

@PubSubListener
class MyGcpListener {

    @Subscription('snappy-way-378809-topic-sub2')
    void onMessage(byte[] data) {
        println "Message received ${new String(data)}"
    }
}
