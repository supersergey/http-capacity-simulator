package com.example.http.capacity.simulator.ktor

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import org.springframework.web.reactive.function.client.awaitExchange

val webFluxClient = WebClient.create("http://localhost:8081")

fun main(args: Array<String>) {
    embeddedServer(Netty, 8084) {
        routing {
            get(path = "/api/ktor") {
                val delay = context.request.queryParameters["delay"] ?: 1000
                val result = webFluxClient
                    .get().uri("/api/delay?delay=$delay")
                    .awaitExchange().awaitBody<String>()
                call.respondText(result)
            }
        }
    }.start(wait = true)
}
