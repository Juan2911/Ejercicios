package com.Medisoft.Medisoft.Domain;

public class EstudianteResultado {
    private String nombre;
    private String resultado;
    private double promedio;

    public EstudianteResultado() {
    }

    public EstudianteResultado(String nombre, String resultado, double promedio) {
        this.nombre = nombre;
        this.resultado = resultado;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
