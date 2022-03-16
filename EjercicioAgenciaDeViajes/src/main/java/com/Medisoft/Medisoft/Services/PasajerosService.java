package com.Medisoft.Medisoft.Services;

import com.Medisoft.Medisoft.Domain.RequestPasajeros;
import com.Medisoft.Medisoft.Domain.ResultadoPasajeros;

import java.util.List;

public interface PasajerosService {
    List<ResultadoPasajeros> datosPasajeros(RequestPasajeros requestPasajeros);
}
