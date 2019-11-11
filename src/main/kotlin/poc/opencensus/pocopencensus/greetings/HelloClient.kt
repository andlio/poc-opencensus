package poc.opencensus.pocopencensus.greetings

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(value = "hello-service", url = "http://localhost:8081")
interface HelloClient {

    @GetMapping("/hello")
    fun hello(@RequestParam name: String): String
}