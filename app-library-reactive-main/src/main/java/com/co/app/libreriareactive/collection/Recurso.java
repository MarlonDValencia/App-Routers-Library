package com.co.app.libreriareactive.collection;

import com.co.app.libreriareactive.utils.Area;
import com.co.app.libreriareactive.utils.Tipo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Recursos")
public class Recurso {

    @Id
    private String id;
    private Tipo tipo;
    private boolean disponible = true;
    private Area area;
    private String nombre;

    public Recurso(){
    }

    public Recurso(String id, Tipo tipo, Area area, String nombre) {
        this.id = id;
        this.tipo = tipo;
        this.area = area;
        this.nombre = nombre;
    }

    public Recurso(Tipo tipo, Area area, String nombre) {
        this.tipo = tipo;
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