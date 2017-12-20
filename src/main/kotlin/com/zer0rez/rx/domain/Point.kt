package com.zer0rez.rx.domain

import com.zer0rez.rx.annotation.Noarg
import java.math.BigDecimal

@Noarg
data class Point(val id: Long, val point: BigDecimal)

