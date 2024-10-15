package com.example.parcial.controller;

import com.example.parcial.modelo.Participante;
import com.example.parcial.servicio.ServicioEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParticipanteControlador {
    @Autowired
    private ServicioEvento servicioEvento;

    // Mapeo para agregar un participante
    @PostMapping("/participantes/agregar")
    public void agregarParticipante(@RequestBody Participante participante) {
        servicioEvento.addParticipante(participante);
    }

    // Mapeo para listar participantes
    @GetMapping("/participantes/listar")
    public List<Participante> listarParticipantes() {
        return servicioEvento.listarParticipantes();
    }
}
