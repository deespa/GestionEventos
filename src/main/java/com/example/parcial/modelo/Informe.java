package com.example.parcial.modelo;

public class Informe {
    private String eventoNombre;
    private int asistentes;

    public Informe(String eventoNombre, int asistentes) {
        this.eventoNombre = eventoNombre;
        this.asistentes = asistentes;
    }

    public String getEventoNombre() {
        return eventoNombre;
    }

    public void setEventoNombre(String eventoNombre) {
        this.eventoNombre = eventoNombre;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }
}
