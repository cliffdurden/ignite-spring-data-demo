package com.github.cliffdurden.ignitespringdatademo.repository

import com.github.cliffdurden.ignitespringdatademo.model.Person
import org.apache.ignite.springdata.repository.IgniteRepository
import org.apache.ignite.springdata.repository.config.RepositoryConfig

@RepositoryConfig(cacheName = "PersonCache")
interface PersonRepository: IgniteRepository<Person, Long> {

    fun findByName(name: String): Person?
}