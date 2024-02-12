package com.springsimplespasos.conceptosbasicos.usoyml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PruebaYaml implements CommandLineRunner {
    @Autowired
    ReadYml readYml;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=====================YAML======================");
        System.out.println("servidor.aplicacion.nombre: "+ readYml.getAplicacion().get("nombre"));
        readYml.getConfiguracion().get("ips").forEach(System.out::println);
        readYml.getConfiguracion().get("files-system").forEach(System.out::println);
        System.out.println("Usuario root username: " + readYml.getUsuarios().get("root").getUsername()
                + ", password: "+ readYml.getUsuarios().get("root").getPassword());
    }
}
