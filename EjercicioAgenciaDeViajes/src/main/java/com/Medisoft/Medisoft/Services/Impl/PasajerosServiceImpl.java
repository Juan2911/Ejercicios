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
    public List<ResultadoPasajeros> obtenerDatosDePasajeros(RequestPasajeros requestPasajeros) {
        List<Pasajeros> pasajerosDeAgencia = requestPasajeros.getPasajeros();
        List<ResultadoPasajeros> detalleDePasajero = new ArrayList<>();
        for (Pasajeros pasajeros : pasajerosDeAgencia) {
            ResultadoPasajeros resultadoPasajeros = new ResultadoPasajeros();
            double tarifaNino = 7500.00;
            resultadoPasajeros.setNombre(pasajeros.getNombre());
            if (pasajeros.getTipoTarifa() == 1) {
                resultadoPasajeros.setDescripcionDeTarifa("Niño");
                resultadoPasajeros.setTarifa(tarifaNino);
                detalleDePasajero.add(resultadoPasajeros);
            }
            if (pasajeros.getTipoTarifa() == 2) {

                resultadoPasajeros.setDescripcionDeTarifa("Adulto");
                double valorAdulto = tarifaNino * 30 / 100;
                resultadoPasajeros.setTarifa(tarifaNino + valorAdulto);
                detalleDePasajero.add(resultadoPasajeros);
            }
            if (pasajeros.getTipoTarifa() == 3) {
                resultadoPasajeros.setDescripcionDeTarifa("Jubilado");
                double valorJubilado = tarifaNino * 10 / 100;
                resultadoPasajeros.setTarifa(tarifaNino - valorJubilado);
                detalleDePasajero.add(resultadoPasajeros);
            }
        }

        return detalleDePasajero;
    }
}
