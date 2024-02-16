package ru.edutech.demo.tdd

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class Cli {

    @Bean
    fun cliSom(metricsService: MetricsService) = CommandLineRunner{

        metricsService.registerMetric()
        metricsService.registerMetric()
        metricsService.registerMetric()

    }

}