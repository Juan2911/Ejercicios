package com.Medisoft.Medisoft.Controllers;

import com.Medisoft.Medisoft.Domain.EstudianteResultado;
import com.Medisoft.Medisoft.Domain.RequestEstudiante;
import com.Medisoft.Medisoft.Services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteServiceImpl;

    @PostMapping(value = "/calcularAprobacion", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EstudianteResultado>> calcularAprobacion(@RequestBody RequestEstudiante requestEstudiante) {

        estudianteServiceImpl.resultadoAprobacion(requestEstudiante);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
