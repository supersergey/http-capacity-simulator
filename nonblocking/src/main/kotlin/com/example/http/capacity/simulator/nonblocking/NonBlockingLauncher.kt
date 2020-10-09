package com.example.http.capacity.simulator.nonblocking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.http.capacity.simulator"])
class NonBlockingLauncher

fun main() {
    runApplication<NonBlockingLauncher>()
}