package com.example.parcial.controller;

import com.example.parcial.modelo.Participante;
import com.example.parcial.servicio.ServicioEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participantes")
public class ParticipanteControlador {

    @Autowired
    private ServicioEvento servicioEvento;

    // Nuevo endpoint para registrar un participante en un evento específico
    @PostMapping("/registrar")
    public void registrarParticipanteEnEvento(@RequestParam String nombreEvento, @RequestBody Participante participante) {
        servicioEvento.addParticipanteAEvento(nombreEvento, participante);
    }

    // Nuevo endpoint para listar los participantes de un evento específico
    @GetMapping("/listar")
    public List<Participante> listarParticipantesDeEvento(@RequestParam String nombreEvento) {
        return servicioEvento.listarParticipantesDeEvento(nombreEvento);
    }
}
