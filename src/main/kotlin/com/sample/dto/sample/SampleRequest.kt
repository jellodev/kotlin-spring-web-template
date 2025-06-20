package com.sample.dto.sample

import jakarta.validation.constraints.NotBlank

data class SampleRequest(
    @field:NotBlank(message = "name must not be blank")
    val name: String,
)
