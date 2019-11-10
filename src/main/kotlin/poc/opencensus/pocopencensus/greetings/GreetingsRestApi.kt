package poc.opencensus.pocopencensus.greetings

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingsRestApi(val greetingsService: GreetingsService) {

    @GetMapping("/greetings/hello")
    fun hello(@RequestParam name: String): ResponseEntity<String> = ResponseEntity.ok(greetingsService.hello(name))

    @GetMapping("/greetings/goodbye")
    fun goodbye(@RequestParam name: String): ResponseEntity<String> = ResponseEntity.ok(greetingsService.goodbye(name))
}