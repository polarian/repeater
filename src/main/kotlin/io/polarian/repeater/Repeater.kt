package io.polarian.repeater

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.sql.Date
import java.sql.Timestamp
import java.util.concurrent.atomic.AtomicInteger

@Component
class Repeater {
    var sharingValue = AtomicInteger()

    @Scheduled(fixedDelay = 1000)
    fun timestamp() {
        val timestamp = Timestamp(System.currentTimeMillis())

        println("[${Thread.currentThread().name}] timestamp :${timestamp} (${sharingValue.getAndIncrement()})")
    }

    @Scheduled(fixedDelay = 3000)
    fun date() {
        val date = Date(System.currentTimeMillis())

        println("[${Thread.currentThread().name}] date : ${date} (${sharingValue.getAndIncrement()})")
    }
}
