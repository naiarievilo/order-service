package dev.naiarievilo.order_service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import jakarta.validation.constraints.NotNull;

@ConfigurationProperties(prefix = "polar")
public record ClientProperties(
    @NotNull
    String catalogServiceUri
) { }
