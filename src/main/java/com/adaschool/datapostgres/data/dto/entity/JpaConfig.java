package com.adaschool.datapostgres.data.dto.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.adaschool.datapostgres.data.dto.entity")
public class JpaConfig {
    // Configuración adicional si es necesaria
}