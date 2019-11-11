package poc.opencensus.pocopencensus.hello

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloRestApi() {

    @GetMapping("/hello")
    fun hello(@RequestParam name: String): ResponseEntity<String> = ResponseEntity.ok("Salut $name")
}