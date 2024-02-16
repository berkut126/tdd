package ru.edutech.demo.tdd

import io.micrometer.core.instrument.MeterRegistry
import org.springframework.stereotype.Service

@Service
class MetricsService(meterRegistry: MeterRegistry) {

    private final val counter = meterRegistry.counter("abc")

    fun registerMetric() = counter.increment()

}