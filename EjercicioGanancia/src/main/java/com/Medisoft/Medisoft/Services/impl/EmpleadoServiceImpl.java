package com.Medisoft.Medisoft.Services.impl;

import com.Medisoft.Medisoft.Domain.EmpleadoSueldo;
import com.Medisoft.Medisoft.Domain.Request;
import com.Medisoft.Medisoft.Services.EmpleadoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Override
    public List<EmpleadoSueldo> calcularSueldo(Request request) {
       return null;
    }
}
