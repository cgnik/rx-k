package com.zer0rez.rx

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

annotation class Noarg

@Noarg
data class Point(val id: Long, val point: BigDecimal)

@Noarg @Document(collection = "stddev")
data class StandardDeviation( @field: Id val id: Long, val answer: BigDecimal, val points: Array<Point>)
