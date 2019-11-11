package poc.opencensus.pocopencensus.hello

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloRestApi(val helloRepository: HelloRepository) {

    @GetMapping("/hello")
    fun hello(@RequestParam name: String): ResponseEntity<String> {
        val text =
                helloRepository.findByName(name)
                        .stream()
                        .findFirst()
                        .map(HelloEntity::text)
                        .orElse("Hello $name")

        return ResponseEntity.ok(text)
    }
}