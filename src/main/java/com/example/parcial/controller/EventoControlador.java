package com.example.parcial.controller;

import com.example.parcial.modelo.Evento;
import com.example.parcial.servicio.ServicioEvento;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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

    @PostMapping("/crear")
    public Evento crearEvento(@RequestParam String nombreEvento, 
                              @RequestParam String ubicacion, 
                              @RequestParam String tipo,
                              @RequestParam String fecha) {
        LocalDate fechaEvento = LocalDate.parse(fecha); // Asegúrate de que la fecha esté en el formato correcto
        Evento evento = new Evento(nombreEvento, fechaEvento, ubicacion, tipo);
        servicioEvento.addEvento(evento);
        return evento; // Retorna el evento creado
    }
}
