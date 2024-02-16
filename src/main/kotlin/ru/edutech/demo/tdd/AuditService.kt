package ru.edutech.demo.tdd

import org.springframework.stereotype.Service

@Service
class AuditService(private final val metricsService: MetricsService) {

    fun registerAuditMessage() {
        metricsService.registerMetric()
    }

}