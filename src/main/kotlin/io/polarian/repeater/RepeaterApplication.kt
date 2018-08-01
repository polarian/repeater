package io.polarian.repeater

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RepeaterApplication

fun main(args: Array<String>) {
    runApplication<RepeaterApplication>(*args)
}
