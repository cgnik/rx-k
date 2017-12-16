package com.zer0rez.rx

import org.springframework.web.bind.annotation.*

@RestController
class StandardDeviationController(
        val repository: StandardDeviationRepository) {
    @GetMapping("/standardDeviation")
    fun findAll() = repository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = repository.findOne(id)

    @PostMapping("/standardDeviation")
    fun save(@RequestBody stddev: StandardDeviation) = repository.save(stddev)
}