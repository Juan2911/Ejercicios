package com.Medisoft.Medisoft.Controllers;

import com.Medisoft.Medisoft.Domain.TransactionRequest;
import com.Medisoft.Medisoft.Services.MaximosYMinimosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class EnterosController {

    @Autowired
    private MaximosYMinimosService maximosYMinimosServiceImpl;

    @PostMapping(value = "/MaximosYMinimos", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Integer>> calcularMaximosYMinimos(@RequestBody TransactionRequest transactionRequest) {

        maximosYMinimosServiceImpl.maximosYMinimos(transactionRequest);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
