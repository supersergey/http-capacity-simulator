package com.example.http.capacity.simulator.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity
import kotlin.random.Random.Default.nextInt

@RestController
@RequestMapping(path = ["/api/blocking"])
class BlockingController(private val restTemplate: RestTemplate) {

    @GetMapping
    fun simulateDelay(@RequestParam(name = "delay", required = false, defaultValue = "5") delay: Int): String {
        val uri = "/" + nextInt(0, delay)
        return restTemplate.getForEntity<String>(uri).body ?: ""
    }
}
