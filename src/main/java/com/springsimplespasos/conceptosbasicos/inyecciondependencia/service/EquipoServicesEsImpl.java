package com.springsimplespasos.conceptosbasicos.inyecciondependencia.service;

import com.springsimplespasos.conceptosbasicos.inyecciondependencia.domain.Equipo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Component("equipos-espanya")
@ConditionalOnProperty(prefix = "app", name = "implementacion", havingValue = "espanya")
public class EquipoServicesEsImpl implements EquipoService{

    private List<Equipo> equipos = new ArrayList<>(Arrays.asList(
        new Equipo(2, "Valencia CF", 1930,LocalDate.of(1930,1,10)),
            new Equipo(3, "Real Betis Balonpie", 1910, LocalDate.of(1953,9,21)),
            new Equipo(4, "Sevilla FC", 1910, LocalDate.of(1921,3,11)),
            new Equipo(5, "Mallorca CF", 1910, LocalDate.of(1955,5,6))
    ));
    @Override
    public Optional<Equipo> obtenerEquipñoPorId(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Equipo> obtenerTodos() {
        return this.equipos;
    }
}
