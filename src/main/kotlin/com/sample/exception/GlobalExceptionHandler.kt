package com.sample.exception

import com.sample.constant.DefaultErrorCode
import com.sample.dto.common.ErrorResponse
import com.sample.util.logger
import org.springframework.http.HttpStatus
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleValidationExceptions(e: MethodArgumentNotValidException): ErrorResponse<DefaultErrorCode> {
        val errors = e.bindingResult.fieldErrors.joinToString(", ") { "${it.field}: ${it.defaultMessage}" }
        logger.warn { "Validation Exception: $errors" }
        return ErrorResponse(DefaultErrorCode.VALIDATION_FAILED, "Validation failed: $errors")
    }

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handleGenericException(e: Exception): ErrorResponse<DefaultErrorCode> {
        logger.error(e) { "An unexpected error occurred: ${e.message}" }
        return ErrorResponse(DefaultErrorCode.INTERNAL_SERVER_ERROR, "An unexpected error occurred.")
    }
}
