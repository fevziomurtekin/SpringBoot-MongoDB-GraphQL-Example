package com.fevziomurtekin.sample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SampleApplication

fun main(args: Array<String>) {
	SpringApplication.run(SampleApplication::class.java,*args)
}
