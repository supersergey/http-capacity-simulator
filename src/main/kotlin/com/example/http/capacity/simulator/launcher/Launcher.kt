package com.example.http.capacity.simulator.launcher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.http.capacity.simulator"])
class Launcher

fun main() {
    runApplication<Launcher>()
}