package com.example.demo

import net.lz1998.cq.EnableCQ
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableCQ
@SpringBootApplication
class SptingCqKotlinDemoApplication

fun main(args: Array<String>) {
	runApplication<SptingCqKotlinDemoApplication>(*args)
}
