package com.Medisoft.Medisoft.Controllers;

import com.Medisoft.Medisoft.Domain.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class EmpleadoController {

    @PostMapping(value = "/calcularSueldo", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> calcularSueldo(@RequestBody Request request) {

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
