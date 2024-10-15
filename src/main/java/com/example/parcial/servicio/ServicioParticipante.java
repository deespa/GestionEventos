package com.example.parcial.servicio;

import com.example.parcial.modelo.Participante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioParticipante {

    private List<Participante> participantes = new ArrayList<>();

    public Participante registrarParticipante(Participante participante) {
        participantes.add(participante);
        return participante;
    }

    public List<Participante> obtenerParticipantes() {
        return participantes;
    }
}
