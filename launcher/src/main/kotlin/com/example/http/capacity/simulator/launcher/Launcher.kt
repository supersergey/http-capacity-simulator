package com.example.http.capacity.simulator.launcher

import com.example.http.capacity.simulator.blocking.app.BlockingApplication
import com.example.http.capacity.simulator.nonblocking.app.NonBlockingApplication
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.Options
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.logging.Logger

@SpringBootApplication
class Launcher

fun main(args: Array<String>) {
    val logger = Logger.getGlobal()
    val options = Options().apply {
        addOption("b", "Blocking mode")
        addOption("nb", "Non-blocking mode")
    }
    val cmd = DefaultParser().parse(options, args)
    when {
        cmd.hasOption("b") -> runApplication<BlockingApplication>().also {
            logger.info("A blocking server started")
        }
        cmd.hasOption("nb") -> runApplication<NonBlockingApplication>().also {
            logger.info("A non-blocking server started")
        }
        else -> throw IllegalArgumentException("Specify either -b or -nb command line option for blocking or " +
            "non-blocking mode")
    }
}