package com.Medisoft.Medisoft.Controllers;

import com.Medisoft.Medisoft.Domain.RequestPasajeros;
import com.Medisoft.Medisoft.Domain.ResultadoPasajeros;
import com.Medisoft.Medisoft.Services.PasajerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping
public class PasajerosController {

    @Autowired
    private PasajerosService pasajerosServiceImpl;

    @PostMapping(value = "/pasajeros", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ResultadoPasajeros>> verPasajeros(@RequestBody RequestPasajeros requestPasajeros) {

        List<ResultadoPasajeros> pasajeros = pasajerosServiceImpl.obtenerDatosDePasajeros(requestPasajeros);

        return new ResponseEntity<>(pasajeros, HttpStatus.OK);

    }

}
