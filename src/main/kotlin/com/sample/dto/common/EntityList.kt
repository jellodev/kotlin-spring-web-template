package com.sample.dto.common

data class EntityList<T>(
    val hasNext: Boolean,
    val lastCursor: Long?,
    val items: List<T>,
) : EntityBody
