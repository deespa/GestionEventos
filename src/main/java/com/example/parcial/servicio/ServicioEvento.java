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

    public ServicioEvento() {
        // Datos de prueba
        eventos.add(new Evento("Conferencia de Tecnología", LocalDate.now().plusDays(30), "Auditorio Principal", "conferencia"));
        eventos.add(new Evento("Boda de Juan y Ana", LocalDate.now().plusDays(60), "Jardín Central", "boda"));
        eventos.add(new Evento("Festival de Música", LocalDate.now().plusDays(90), "Plaza Central", "festival"));
    }

    public void addEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    // Nuevo método para agregar participante a un evento específico
    public void addParticipanteAEvento(String nombreEvento, Participante participante) {
        for (Evento evento : eventos) {
            if (evento.getNombre().equals(nombreEvento)) {
                evento.addParticipante(participante);
                break;
            }
        }
    }

    // Nuevo método para listar los participantes de un evento específico
    public List<Participante> listarParticipantesDeEvento(String nombreEvento) {
        for (Evento evento : eventos) {
            if (evento.getNombre().equals(nombreEvento)) {
                return evento.getParticipantes();
            }
        }
        return new ArrayList<>();
    }
}
