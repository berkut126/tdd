package ru.edutech.demo.tdd

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/rest/audit/messages")
class AuditController(private val auditService: AuditService) {

    @PostMapping
    fun registerAuditMessage(@RequestBody auditMessage: AuditMessage): ResponseEntity<UUID> {
        auditService.registerAuditMessage()
        return ResponseEntity.ok(auditMessage.entityId)
    }

}