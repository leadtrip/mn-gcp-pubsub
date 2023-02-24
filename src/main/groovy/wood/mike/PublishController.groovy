package wood.mike

import io.micronaut.core.annotation.NonNull
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import reactor.core.publisher.Mono

@Controller('/api')
class PublishController {

    private static Logger logger = LoggerFactory.getLogger(PublishController.class);

    private final MyGcpClient myGcpClient

    PublishController(MyGcpClient myGcpClient) {
        this.myGcpClient = myGcpClient
    }

    @Get('/word/{word}')
    Mono<String> word(@PathVariable @NonNull String word) {
        logger.info("Publishing $word")
        myGcpClient.word(word.bytes)
    }

    @Post('/fish')
    Mono<String> fish(@Body @NonNull Fish fish) {
        logger.info("Publishing fish ${fish?.name}")
        myGcpClient.fish(fish)
    }
}
