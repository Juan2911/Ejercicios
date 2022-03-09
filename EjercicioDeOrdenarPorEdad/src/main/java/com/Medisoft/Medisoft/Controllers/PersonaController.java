package com.Medisoft.Medisoft.Controllers;

import com.Medisoft.Medisoft.Domain.RequestPersona;
import com.Medisoft.Medisoft.Services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService usuarioServiceImpl;

    @PostMapping(value = "/ordenar", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> postPersona(@RequestBody RequestPersona requestPersona) {

        usuarioServiceImpl.postPersona(requestPersona);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
