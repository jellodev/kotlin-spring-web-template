package com.project.controller

import com.project.dto.common.ApiResponse
import com.project.dto.common.SingleEntity
import com.project.service.SampleService
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

class SampleControllerTest : FunSpec({

    val sampleService = mockk<SampleService>()
    val sampleController = SampleController(sampleService)

    test("GET /helloWorld should return hello world string") {
        every { sampleService.getHelloWorldString() } returns "Hello, World!"

        val response: ApiResponse<SingleEntity<String>> = sampleController.hello()

        response.entityType shouldBe "sample"
        response.entityBody shouldBe SingleEntity("Hello, World!")
    }
})
