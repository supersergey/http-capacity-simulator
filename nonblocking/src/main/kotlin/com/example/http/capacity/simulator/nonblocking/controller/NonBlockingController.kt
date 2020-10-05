package com.example.http.capacity.simulator.nonblocking.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import org.springframework.web.reactive.function.client.awaitExchange
import kotlin.random.Random.Default.nextInt

@RestController
@RequestMapping(path = ["/api/nonblocking"])
class NonBlockingController(private val webClient: WebClient) {

    @GetMapping
    suspend fun simulateDelay(
        @RequestParam(name = "delay", required = false, defaultValue = "5") delay: Int
    ): String {
        val uri = "/" + nextInt(0, delay)
        return webClient.get().uri(uri)
            .awaitExchange().awaitBody()
    }
}