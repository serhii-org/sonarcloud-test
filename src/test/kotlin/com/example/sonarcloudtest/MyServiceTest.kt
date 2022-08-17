package com.example.sonarcloudtest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MyServiceTest {

    val svc = MyService()

    @Test
    fun sum() {
        assertThat(svc.sum(2, 2)).isEqualTo(4)
    }
}