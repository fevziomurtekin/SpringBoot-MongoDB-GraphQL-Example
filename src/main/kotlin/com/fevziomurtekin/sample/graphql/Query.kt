package com.fevziomurtekin.sample.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class Query : GraphQLQueryResolver {
    fun version() = "1.0.0"
}