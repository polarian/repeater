package io.polarian.repeater

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling
import java.util.concurrent.Executor
import java.util.concurrent.Executors

@SpringBootApplication
@EnableScheduling
class RepeaterApplication {
    @Bean
    fun taskScheduler(): Executor {
        return Executors.newScheduledThreadPool(2)
    }
}

fun main(args: Array<String>) {
    runApplication<RepeaterApplication>(*args)
}
