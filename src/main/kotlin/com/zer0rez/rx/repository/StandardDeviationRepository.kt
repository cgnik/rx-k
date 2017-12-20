package com.zer0rez.rx.repository

import com.zer0rez.rx.domain.StandardDeviation
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.data.repository.CrudRepository

@EnableMongoRepositories
interface StandardDeviationRepository : CrudRepository<StandardDeviation, Long> {}
