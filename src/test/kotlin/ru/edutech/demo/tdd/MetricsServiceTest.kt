package ru.edutech.demo.tdd

import io.micrometer.core.instrument.simple.SimpleMeterRegistry
import org.junit.jupiter.api.Test

class MetricsServiceTest {

    @Test
    fun testMetrics() {
        val registry = SimpleMeterRegistry()
        val metricsService = MetricsService(registry)
        metricsService.registerMetric()
        assert(registry.find("abc").counter()?.count()?.toInt() == 1)
    }

}