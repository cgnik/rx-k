package com.zer0rez.rx.service

import com.zer0rez.rx.repository.StandardDeviationRepository
import com.zer0rez.rx.domain.StandardDeviation
import org.springframework.web.bind.annotation.*

@RestController
class StandardDeviationController(
        val repository: StandardDeviationRepository) {
    @GetMapping("/standardDeviation")
    fun findAll() = repository.findAll()

    @GetMapping("/standardDeviation/{id}")
    fun findById(@PathVariable id: Long) : StandardDeviation? = repository.findOne(id)

    @PostMapping("/standardDeviation")
    fun save(@RequestBody stddev: StandardDeviation) = repository.save(stddev)
}