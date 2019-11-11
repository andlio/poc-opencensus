package poc.opencensus.pocopencensus.greetings

import org.springframework.stereotype.Component

@Component
class GreetingsService(val helloClient: HelloClient) {

//    fun hello(name: String): String = "hello $name :)"
    fun hello(name: String): String = "${helloClient.hello(name)} :)"
    fun goodbye(name: String): String = "goodbye $name :("
}