package ru.edutech.demo.tdd

import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime
import java.util.*

data class AuditMessage(
    val message: String,
    val operationCode: String,
    val operationName: String,
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) val createTs: LocalDateTime,
    val isSuccess: Boolean,
    val action: String,
    val entityId: UUID,
    val entityTypeCode: String,
    val userId: UUID,
)
