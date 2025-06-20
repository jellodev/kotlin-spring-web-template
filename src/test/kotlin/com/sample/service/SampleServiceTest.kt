package com.sample.service

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SampleServiceTest : FunSpec({

    val sampleService = SampleService()

    test("getHelloWorldString should return 'Hello, world!'") {
        val result = sampleService.getHelloWorldString()
        result shouldBe "Hello, world!"
    }
})
