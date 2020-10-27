package com.example.http.capacity.simulator.delay.controller

import kotlinx.coroutines.delay
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@RestController
@RequestMapping("/api/delay")
@ExperimentalTime
class DelayController {
    @GetMapping
    suspend fun getDelay(@RequestParam(required = false, defaultValue = "1000") delay: Long): Long = measureTime {
        delay(delay)
    }.toLongMilliseconds()
}