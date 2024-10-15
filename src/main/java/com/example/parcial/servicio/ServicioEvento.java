package com.example.parcial.servicio;

import com.example.parcial.modelo.Evento;
import com.example.parcial.modelo.Participante;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioEvento {
    private List<Evento> eventos = new ArrayList<>();
    private List<Participante> participantes = new ArrayList<>();

    public ServicioEvento() {
        // Datos de prueba
        eventos.add(new Evento("Conferencia de Tecnología", LocalDate.now().plusDays(30), "Auditorio Principal", "conferencia"));
        eventos.add(new Evento("Boda de Juan y Ana", LocalDate.now().plusDays(60), "Jardín Central", "boda"));
        eventos.add(new Evento("Festival de Música", LocalDate.now().plusDays(90), "Plaza Central", "festival"));

        participantes.add(new Participante("Juan Pérez", "juan.perez@example.com"));
        participantes.add(new Participante("Ana Gómez", "ana.gomez@example.com"));
        participantes.add(new Participante("Luis Rodríguez", "luis.rodriguez@example.com"));
    }

    public void addEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public void addParticipante(Participante participante) {
        participantes.add(participante);
    }

    public List<Participante> listarParticipantes() {
        return participantes;
    }
}
