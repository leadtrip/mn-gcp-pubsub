package wood.mike

import groovy.transform.CompileStatic
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@CompileStatic
class Fish {
    String name
}
