package poc.opencensus.pocopencensus.hello

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.core.env.AbstractEnvironment

@SpringBootApplication
class PocOpencensusApplication

fun main(args: Array<String>) {
	System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "hello");
	runApplication<PocOpencensusApplication>(*args)
}
