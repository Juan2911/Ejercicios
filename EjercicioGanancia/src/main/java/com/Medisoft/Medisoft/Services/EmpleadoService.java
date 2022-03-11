package com.Medisoft.Medisoft.Services;

import com.Medisoft.Medisoft.Domain.EmpleadoSueldo;
import com.Medisoft.Medisoft.Domain.Request;

import java.util.List;

public interface EmpleadoService {
    List<EmpleadoSueldo> calcularSueldo(Request request);
}
