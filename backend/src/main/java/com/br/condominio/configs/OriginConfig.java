package com.br.condominio.configs;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class OriginConfig {
    @Value("${allow.origin}")
    private String origin;
}
