package com.sample.service

import org.springframework.stereotype.Service

@Service
class SampleService {
    fun getHelloWorldString(): String {
        return "Hello, world!"
    }
}
