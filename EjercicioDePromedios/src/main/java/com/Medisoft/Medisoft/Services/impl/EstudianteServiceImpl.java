package com.Medisoft.Medisoft.Services.impl;

import com.Medisoft.Medisoft.Domain.Estudiante;
import com.Medisoft.Medisoft.Domain.EstudianteResultado;
import com.Medisoft.Medisoft.Domain.RequestEstudiante;
import com.Medisoft.Medisoft.Services.EstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Override
    public List<EstudianteResultado> resultadoAprobacion(RequestEstudiante requestEstudiante) {
        List<Estudiante> estudiantes = requestEstudiante.getPersonas();

        return null;
    }
}
