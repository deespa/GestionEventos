package com.example.parcial.servicio;

import com.example.parcial.modelo.Informe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioInforme {

    private List<Informe> informes = new ArrayList<>();

    public void generarInforme(Informe informe) {
        informes.add(informe);
    }

    public List<Informe> obtenerInformes() {
        return informes;
    }
}
