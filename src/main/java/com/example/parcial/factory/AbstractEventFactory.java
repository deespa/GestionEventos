package com.example.parcial.factory;

import com.example.parcial.modelo.Evento;
import com.example.parcial.modelo.Participante;

import java.time.LocalDate;

public interface AbstractEventFactory {
    Evento createEvento(String nombre, LocalDate fecha, String ubicacion, String tipo);
    Participante createParticipante(String nombre, String correo);
}
