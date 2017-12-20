package com.zer0rez.rx.domain

import com.zer0rez.rx.annotation.Noarg
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

@Noarg
@Document(collection = "stddev")
data class StandardDeviation(@field: Id val id: Long, val answer: BigDecimal, val points: Array<Point>)