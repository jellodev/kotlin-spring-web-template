package com.sample.controller

import com.sample.dto.common.ApiResponse
import com.sample.dto.common.SingleEntity
import com.sample.dto.sample.SampleRequest
import com.sample.service.SampleService
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.mockk.clearMocks
import io.mockk.every
import io.mockk.mockk

class SampleControllerTest : FunSpec({

    val sampleService = mockk<SampleService>()
    val sampleController = SampleController(sampleService)

    beforeEach {
        clearMocks(sampleService) // SampleService mock 객체 초기화를 통한 테스트 간 상태 공유 방지
    }

    test("GET /helloWorld should return hello world with name") {
        // SampleService 이 항상 같은 값 반환하도록 설정
        every { sampleService.getHelloWorldString() } returns "Hello, world!"

        val requestName = "Ko"
        val validRequest = SampleRequest(name = requestName)
        val response: ApiResponse<SingleEntity<String>> = sampleController.hello(validRequest)

        response.entityType shouldBe "sample"
        response.entityBody shouldBe SingleEntity("Hello, world! Ko")
    }
})
