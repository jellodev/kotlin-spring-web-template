package com.sample.dto.common

data class DeletedEntity(
    val id: String,
    val refId: String?,
) : EntityBody
