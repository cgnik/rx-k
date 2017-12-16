package com.zer0rez.rx

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

annotation class Noarg

@Noarg
data class Point(@Id val id: Long, val point: BigDecimal)

@Noarg
data class StandardDeviation(@Id @column(name = "_id") val id: Long, val answer: BigDecimal, @Document val points: Array<Point>)
