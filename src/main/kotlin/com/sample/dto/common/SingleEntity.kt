package com.sample.dto.common

data class SingleEntity<T>(
    val data: T,
) : EntityBody
