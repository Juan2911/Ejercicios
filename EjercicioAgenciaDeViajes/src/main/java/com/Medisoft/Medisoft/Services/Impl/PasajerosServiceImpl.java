package com.Medisoft.Medisoft.Services.Impl;

import com.Medisoft.Medisoft.Domain.Pasajeros;
import com.Medisoft.Medisoft.Domain.RequestPasajeros;
import com.Medisoft.Medisoft.Domain.ResultadoPasajeros;
import com.Medisoft.Medisoft.Services.PasajerosService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PasajerosServiceImpl implements PasajerosService {

    @Override
    public List<ResultadoPasajeros> datosPasajeros(RequestPasajeros requestPasajeros) {
        List<Pasajeros> datos = requestPasajeros.getPasajeros();
        List<ResultadoPasajeros> resultadoDatos = new ArrayList<>();
        for (Pasajeros pasajeros : datos) {
            ResultadoPasajeros resultadoPasajeros = new ResultadoPasajeros();
            double tarifaNino = 7500.00;
            if (pasajeros.getTipoTarifa() == 1){
                resultadoPasajeros.setNombre(pasajeros.getNombre());
                resultadoPasajeros.setDescripcionDeTarifa("Niño");
                resultadoPasajeros.setTarifa(tarifaNino);
                resultadoDatos.add(resultadoPasajeros);
            } else if (pasajeros.getTipoTarifa() == 2) {
                resultadoPasajeros.setNombre(pasajeros.getNombre());
                resultadoPasajeros.setDescripcionDeTarifa("Adulto");
                double valorAdulto = tarifaNino * 30 / 100;
                resultadoPasajeros.setTarifa(tarifaNino + valorAdulto);
                resultadoDatos.add(resultadoPasajeros);
            } else {
                if (pasajeros.getTipoTarifa() == 3){
                    resultadoPasajeros.setNombre(pasajeros.getNombre());
                    resultadoPasajeros.setDescripcionDeTarifa("Jubilado");
                    double valorJubilado = tarifaNino * 10 / 100;
                    resultadoPasajeros.setTarifa(tarifaNino - valorJubilado);
                    resultadoDatos.add(resultadoPasajeros);
                }
            }

        }
        return resultadoDatos;
    }
}
