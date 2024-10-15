package com.example.parcial.factory;

import com.example.parcial.modelo.Evento;
import com.example.parcial.modelo.Participante;

import java.time.LocalDate;

public class EventoConferenciaFactory implements AbstractEventFactory {
    @Override
    public Evento createEvento(String nombre, LocalDate fecha, String ubicacion, String tipo) {
        return new Evento(nombre, fecha, ubicacion, "conferencia");
    }

    @Override
    public Participante createParticipante(String nombre, String correo) {
        return new Participante(nombre, correo);
    }
}
