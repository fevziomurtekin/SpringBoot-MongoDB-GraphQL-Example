package com.fevziomurtekin.sample.data

import com.fevziomurtekin.sample.core.Env
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = Env.collection_covid)
data class Covid(
        @Id
        @Value("_id")
        val _id:String,
        var date:String,
        var test:String,
        var death:String,
        var recovered:String
)