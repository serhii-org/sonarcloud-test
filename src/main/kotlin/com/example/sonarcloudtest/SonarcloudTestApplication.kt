package com.example.sonarcloudtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SonarcloudTestApplication

fun main(args: Array<String>) {
    runApplication<SonarcloudTestApplication>(*args)
}

