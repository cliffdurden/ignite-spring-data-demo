package com.github.cliffdurden.ignitespringdatademo.config

import com.github.cliffdurden.ignitespringdatademo.model.Person
import org.apache.ignite.client.ClientCache
import org.apache.ignite.client.IgniteClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class AppIgniteConfiguration {

    @Bean
    fun cache(client: IgniteClient): ClientCache<Long, Person> {
        return client.getOrCreateCache("PersonCache")
    }

}