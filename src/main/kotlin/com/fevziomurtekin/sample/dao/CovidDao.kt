package com.fevziomurtekin.sample.dao

import com.fevziomurtekin.sample.data.Covid
import com.fevziomurtekin.sample.repository.CovidRepository
import org.bson.types.ObjectId
import org.springframework.stereotype.Component
import java.util.*

@Component
class CovidDao (private val covidRepository: CovidRepository){

    fun getContentByDate(date:String) = covidRepository.findByDateLike(date)

    fun getAllByDate() = covidRepository.getAllByDate()

    fun newData(date: String,
                death:String,
                recovered:String,
                test:String) = covidRepository.save(Covid(
            _id = "",
            date = date,
            death = death,
            recovered =recovered,
            test = test
    ))

    fun deleteData(id: String) = covidRepository.deleteById(id)

}