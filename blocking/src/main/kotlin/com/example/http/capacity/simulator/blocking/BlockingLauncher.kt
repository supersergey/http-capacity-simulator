package com.example.http.capacity.simulator.blocking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlockingLauncher

fun main() {
    runApplication<BlockingLauncher>()
}