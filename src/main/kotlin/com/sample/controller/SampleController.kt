package com.sample.controller

import com.sample.dto.common.ApiResponse
import com.sample.dto.common.SingleEntity
import com.sample.dto.sample.SampleRequest
import com.sample.service.SampleService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class SampleController(private val sampleService: SampleService) {
    @PostMapping("helloWorld")
    fun hello(
        @RequestBody @Valid request: SampleRequest,
    ): ApiResponse<SingleEntity<String>> {
        val helloWorldString = sampleService.getHelloWorldString()
        return ApiResponse(
            entityType = "sample",
            entityBody = SingleEntity("$helloWorldString ${request.name}"),
        )
    }
}
