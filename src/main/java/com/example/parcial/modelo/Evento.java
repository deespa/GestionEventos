package com.example.parcial.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private String ubicacion;
    private String tipo;
    private List<Participante> participantes; // Nueva lista de participantes

    public Evento(String nombre, LocalDate fecha, String ubicacion, String tipo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.participantes = new ArrayList<>(); // Inicialización de la lista de participantes
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos para manejar la lista de participantes
    public void addParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
