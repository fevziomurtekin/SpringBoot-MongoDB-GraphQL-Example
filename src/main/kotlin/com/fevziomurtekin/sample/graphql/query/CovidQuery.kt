package com.fevziomurtekin.sample.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.fevziomurtekin.sample.dao.CovidDao
import org.springframework.stereotype.Component

@Component
class CovidQuery(private val covidDao: CovidDao) : GraphQLQueryResolver {

    fun allContent() = covidDao.findAll()

    fun allContentByDate(date:String) = covidDao.getContentByDate(date)

}