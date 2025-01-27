package com.github.cliffdurden.ignitespringdatademo

import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableIgniteRepositories
class IgniteSpringDataDemoApplication

fun main(args: Array<String>) {
    runApplication<IgniteSpringDataDemoApplication>(*args)
}
