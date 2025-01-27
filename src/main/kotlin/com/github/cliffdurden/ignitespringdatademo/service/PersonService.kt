package com.github.cliffdurden.ignitespringdatademo.service

import com.github.cliffdurden.ignitespringdatademo.model.Person
import com.github.cliffdurden.ignitespringdatademo.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(
    private val repository: PersonRepository
) {

    fun findAll(): List<Person> {
        return repository.findAll().toList()
    }

    fun findByName(name: String): Person? {
        return repository.findByName(name)
    }
}