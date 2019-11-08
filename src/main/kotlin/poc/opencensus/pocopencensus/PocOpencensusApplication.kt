package poc.opencensus.pocopencensus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocOpencensusApplication

fun main(args: Array<String>) {
	runApplication<PocOpencensusApplication>(*args)
}
