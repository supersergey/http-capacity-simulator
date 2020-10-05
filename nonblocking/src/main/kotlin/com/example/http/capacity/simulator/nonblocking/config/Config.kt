package com.example.http.capacity.simulator.nonblocking.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class Config {
    @Bean
    fun webClient(): WebClient = WebClient.builder().baseUrl(baseUrl).build()

    companion object {
        const val baseUrl = "https://postman-echo.com/delay"
    }
}