package com.springsimplespasos.conceptosbasicos.inyecciondependencia.service;

import com.springsimplespasos.conceptosbasicos.inyecciondependencia.domain.Equipo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component("equipos-argentina")
@ConditionalOnProperty(prefix = "app", name = "implementacion", havingValue = "argentina")
public class EquipoServicesArgImpl implements EquipoService{

    private List<Equipo> equipos = new ArrayList<>(Arrays.asList(
            new Equipo(1, "River Plate", 1910, LocalDate.of(1910,8,25)),
            new Equipo(2, "Boca Juniors", 1930, LocalDate.of(1930,6,27))
    ));

    @Override
    public Optional<Equipo> obtenerEquipñoPorId(Integer id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Equipo> obtenerTodos() {
        return equipos;
    }
}
