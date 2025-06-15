package com.sample.controller

import com.sample.dto.common.ApiResponse
import com.sample.dto.common.SingleEntity
import com.sample.service.SampleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class SampleController(private val sampleService: SampleService) {
    @GetMapping("helloWorld")
    fun hello(): ApiResponse<SingleEntity<String>> {
        val helloWorldString = sampleService.getHelloWorldString()
        return ApiResponse(
            entityType = "sample",
            entityBody = SingleEntity(helloWorldString),
        )
    }
}
