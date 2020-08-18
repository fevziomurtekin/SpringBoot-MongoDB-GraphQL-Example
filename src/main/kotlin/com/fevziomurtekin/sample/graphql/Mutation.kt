package com.fevziomurtekin.sample.graphql

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.fevziomurtekin.sample.dao.CovidDao
import org.springframework.stereotype.Component

@Component
class Mutation (private val covidDao: CovidDao) : GraphQLMutationResolver{
    fun createCovid(date:String,death:String,recovered:String,test:String)
            = covidDao.newData(date,death,recovered,test)

    fun deleteCovid(id:String)
            = covidDao.deleteData(id)
}