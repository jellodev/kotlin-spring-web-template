package com.sample.dto.common
import com.sample.constant.ErrorCode

data class ErrorResponse<T : ErrorCode>(
    val code: T,
    val message: String,
)
