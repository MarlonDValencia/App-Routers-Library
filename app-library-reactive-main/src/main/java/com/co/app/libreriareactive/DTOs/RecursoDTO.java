package com.co.app.libreriareactive.DTOs;

import com.co.app.libreriareactive.utils.Area;
import com.co.app.libreriareactive.utils.Tipo;

import java.time.LocalDate;

public class RecursoDTO {

    private String id;
    private Tipo tipo;
    private boolean disponible;
    private Area area;
    private String nombre;

    public RecursoDTO(){
    }

    public RecursoDTO(Tipo tipo, Area area, String nombre) {
        this.tipo = tipo;
        this.area = area;
        this.nombre = nombre;
    }

    public RecursoDTO(String id, Tipo tipo, boolean disponible, Area area, String nombre) {
        this.id = id;
        this.tipo = tipo;
        this.disponible = disponible;
        this.area = area;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}