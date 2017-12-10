package com.zer0rez.rx

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RxKApplication

fun main(args: Array<String>) {
    SpringApplication.run(RxKApplication::class.java, *args)
}
