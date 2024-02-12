package com.springsimplespasos.conceptosbasicos.inyecciondependencia.service;

import com.springsimplespasos.conceptosbasicos.inyecciondependencia.domain.Equipo;

import java.util.Optional;

public interface EquipoService {
    Optional<Equipo> obtenerEquipñoPorId(Integer id);
    Iterable<Equipo> obtenerTodos();
}
