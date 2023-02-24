package wood.mike

import io.micronaut.gcp.pubsub.annotation.PubSubClient
import io.micronaut.gcp.pubsub.annotation.Topic
import reactor.core.publisher.Mono

@PubSubClient
interface MyGcpClient {

    @Topic('snappy-way-378809-topic')
    Mono<String> send(byte[] data)
}