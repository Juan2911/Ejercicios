package com.Medisoft.Medisoft.Domain;

import java.util.List;

public class RequestEstudiante {
    List<Estudiante> estudiantes;

    public RequestEstudiante(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public RequestEstudiante() {}

    public List<Estudiante> getPersonas() {
        return estudiantes;
    }

    public void setPersonas(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
