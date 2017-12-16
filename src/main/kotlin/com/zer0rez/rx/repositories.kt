package com.zer0rez.rx

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.data.repository.CrudRepository

@EnableMongoRepositories
interface StandardDeviationRepository : CrudRepository<StandardDeviation, Long> {}
