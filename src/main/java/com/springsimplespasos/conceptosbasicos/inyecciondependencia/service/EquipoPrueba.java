package com.springsimplespasos.conceptosbasicos.inyecciondependencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EquipoPrueba implements CommandLineRunner {

    @Autowired
    //@Qualifier("equipos-espanya")
    EquipoService equipoServiceEs;

    @Autowired
    //@Qualifier("equipos-argentina")
    EquipoService equipoServiceAr;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("======== ES ==============");
        equipoServiceEs.obtenerTodos().forEach(System.out::println);
        System.out.println("=========== ARG ===========");
        equipoServiceAr.obtenerTodos().forEach(System.out::println);
    }
}
