package com.springsimplespasos.conceptosbasicos.inyecciondependencia.domain;

import java.time.LocalDate;

public class Equipo {
    private Integer id;
    private String nombre;
    private Integer anyo;
    private LocalDate fechaFundacion;

    public Equipo(Integer id, String nombre, Integer anyo, LocalDate fechaFundacion) {
        this.id = id;
        this.nombre = nombre;
        this.anyo = anyo;
        this.fechaFundacion = fechaFundacion;
    }

    public Equipo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anyo=" + anyo +
                ", fechaFundacion=" + fechaFundacion +
                '}';
    }
}
