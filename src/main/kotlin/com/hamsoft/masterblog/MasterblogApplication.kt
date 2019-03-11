package com.hamsoft.masterblog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MasterblogApplication

fun main(args: Array<String>) {
    runApplication<MasterblogApplication>(*args)
}
