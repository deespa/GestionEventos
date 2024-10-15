package com.example.parcial.controller;

import com.example.parcial.modelo.Evento;
import com.example.parcial.servicio.ServicioEvento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoControlador {
    private final ServicioEvento servicioEvento;

    public EventoControlador(ServicioEvento servicioEvento) {
        this.servicioEvento = servicioEvento;
    }

    @GetMapping("/listar")
    public List<Evento> listarEventos() {
        return servicioEvento.listarEventos();
    }
}
