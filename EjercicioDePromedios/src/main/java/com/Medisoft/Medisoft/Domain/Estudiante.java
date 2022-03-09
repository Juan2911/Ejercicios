package com.Medisoft.Medisoft.Domain;

public class Estudiante {
    private String nombre;
    private int primerParcial;
    private int segundoParcial;
    private int tercerParcial;

    public Estudiante() {
    }

    public Estudiante(String nombre, int primerParcial, int segundoParcial, int tercerParcial) {
        this.nombre = nombre;
        this.primerParcial = primerParcial;
        this.segundoParcial = segundoParcial;
        this.tercerParcial = tercerParcial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(int primerParcial) {
        this.primerParcial = primerParcial;
    }

    public int getSegundoParcial() {
        return segundoParcial;
    }

    public void setSegundoParcial(int segundoParcial) {
        this.segundoParcial = segundoParcial;
    }

    public int getTercerParcial() {
        return tercerParcial;
    }

    public void setTercerParcial(int tercerParcial) {
        this.tercerParcial = tercerParcial;
    }
}
