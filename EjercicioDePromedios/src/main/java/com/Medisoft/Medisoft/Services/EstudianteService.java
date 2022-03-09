package com.Medisoft.Medisoft.Services;

import com.Medisoft.Medisoft.Domain.EstudianteResultado;
import com.Medisoft.Medisoft.Domain.RequestEstudiante;

import java.util.List;

public interface EstudianteService {
    List<EstudianteResultado> resultadoAprobacion(RequestEstudiante requestEstudiante);
}
