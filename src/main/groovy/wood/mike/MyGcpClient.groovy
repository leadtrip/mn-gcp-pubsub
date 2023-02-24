package wood.mike

import io.micronaut.gcp.pubsub.annotation.PubSubClient
import io.micronaut.gcp.pubsub.annotation.Topic
import reactor.core.publisher.Mono

@PubSubClient
interface MyGcpClient {

    @Topic('words')
    Mono<String> word(byte[] data)

    @Topic('fish')
    Mono<String> fish(Fish fish)
}