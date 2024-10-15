package com.example.parcial.builder;

import com.example.parcial.modelo.Evento;
import java.time.LocalDate;

public class EventoBuilder {
    private String nombre;
    private LocalDate fecha;
    private String ubicacion;
    private String tipo;

    public EventoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EventoBuilder setFecha(LocalDate fecha) {
        this.fecha = fecha;
        return this;
    }

    public EventoBuilder setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
        return this;
    }

    public EventoBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Evento build() {
        return new Evento(nombre, fecha, ubicacion, tipo);
    }
}
