package com.example.demo.databases

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "spring.datasource")
data class PostgresConfig(val url: String, val username: String, val password: String, val driverClassName: String)
