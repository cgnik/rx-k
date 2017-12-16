package com.zer0rez.rx

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RxApplication

fun main(args: Array<String>) {
    SpringApplication.run(RxApplication::class.java, *args)
}
