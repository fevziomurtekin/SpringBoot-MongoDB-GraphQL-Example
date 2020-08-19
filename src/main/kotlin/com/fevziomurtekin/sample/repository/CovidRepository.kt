package com.fevziomurtekin.sample.repository

import com.fevziomurtekin.sample.data.Covid
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CovidRepository : MongoRepository<Covid,String> {

    //fun findAll():MutableList<Covid>

    fun findByDateLike(dates:String):Covid

}