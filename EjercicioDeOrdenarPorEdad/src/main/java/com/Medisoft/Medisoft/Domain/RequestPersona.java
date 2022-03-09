package com.Medisoft.Medisoft.Domain;

import java.util.List;

public class RequestPersona {
    List<Persona> personas;

    public RequestPersona(List<Persona> personas) {
        this.personas = personas;
    }
    public RequestPersona() {}

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
