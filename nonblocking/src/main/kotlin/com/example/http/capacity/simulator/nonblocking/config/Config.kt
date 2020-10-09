package com.example.http.capacity.simulator.nonblocking.config

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class Config {
    @Bean
    fun restTemplate(): RestTemplate =
        RestTemplateBuilder().build()

    @Bean
    fun webClient(): WebClient = WebClient.builder().baseUrl(baseUrl).build()

    companion object {
        const val baseUrl = "http://localhost:8081/api/delay"
    }
}