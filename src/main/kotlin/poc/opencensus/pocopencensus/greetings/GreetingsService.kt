package poc.opencensus.pocopencensus.greetings

import org.springframework.stereotype.Component

@Component
class GreetingsService {
    fun hello(name: String): String = "hello $name :)"
    fun goodbye(name: String): String = "goodbye $name :("
}