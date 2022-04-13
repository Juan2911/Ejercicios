package com.Medisoft.Medisoft.Domain;

public class Empleado {
    private String nombre;
    private double sueldoNeto;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }
}
