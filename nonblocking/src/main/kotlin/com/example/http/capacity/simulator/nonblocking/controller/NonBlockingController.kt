package com.example.http.capacity.simulator.nonblocking.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import org.springframework.web.reactive.function.client.awaitExchange
import org.springframework.web.reactive.function.client.bodyToMono
import reactor.core.publisher.Mono

@RestController
@RequestMapping(path = ["/api/nonblocking"])
class NonBlockingController(private val webClient: WebClient) {

    @GetMapping
    suspend fun simulateDelay(@RequestParam(name = "delay") delay: Int): String {
        return webClient.get().uri("?delay=$delay").awaitExchange().awaitBody()
    }
}