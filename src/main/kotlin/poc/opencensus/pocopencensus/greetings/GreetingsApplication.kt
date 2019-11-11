package poc.opencensus.pocopencensus.greetings

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.core.env.AbstractEnvironment

@SpringBootApplication
@EnableFeignClients
class PocOpencensusApplication

fun main(args: Array<String>) {
	System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "greetings");
	runApplication<PocOpencensusApplication>(*args)
}
