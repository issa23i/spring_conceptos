package com.springsimplespasos.conceptosbasicos.inyecciondependencia.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EquipoConfig {
    @Bean
    public EquipoService getEquipoUno(){
        return new EquipoServicesImplUno();
    }
}
