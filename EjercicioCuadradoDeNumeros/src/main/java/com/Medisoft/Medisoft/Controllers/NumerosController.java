package com.Medisoft.Medisoft.Controllers;

import com.Medisoft.Medisoft.Domain.TransactionRequest;
import com.Medisoft.Medisoft.Services.PotenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class NumerosController {

    @Autowired
    private PotenciaService potenciaServiceImpl;

    @PostMapping(value = "/Potencia", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Float>> calcularPotencias(@RequestBody TransactionRequest transactionRequest) {

        potenciaServiceImpl.maximosYMinimos(transactionRequest);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
