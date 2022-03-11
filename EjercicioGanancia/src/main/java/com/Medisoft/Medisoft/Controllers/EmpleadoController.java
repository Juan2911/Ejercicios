package com.Medisoft.Medisoft.Controllers;

import com.Medisoft.Medisoft.Domain.Empleado;
import com.Medisoft.Medisoft.Domain.EmpleadoSueldo;
import com.Medisoft.Medisoft.Domain.Request;
import com.Medisoft.Medisoft.Services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class EmpleadoController {

    @Autowired
    private EmpleadoService pepito;

    @PostMapping(value = "/calcularSueldo", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmpleadoSueldo>> calcularSueldo(@RequestBody Request request) {

        List<EmpleadoSueldo> empleadoSueldos = pepito.calcularSueldo(request);

        return new ResponseEntity<>(empleadoSueldos, HttpStatus.OK);
    }

}
