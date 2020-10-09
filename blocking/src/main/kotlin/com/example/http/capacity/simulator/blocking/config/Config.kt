package com.example.http.capacity.simulator.blocking.config

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class Config {
    @Bean
    fun restTemplate(): RestTemplate =
        RestTemplateBuilder().rootUri(baseUrl).build()

    companion object {
        const val baseUrl = "http://localhost:8081/api"
    }
}