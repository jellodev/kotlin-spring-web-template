package com.sample.dto.common

data class ApiResponse<T : EntityBody>(
    val entityType: String,
    val entityBody: T,
)
