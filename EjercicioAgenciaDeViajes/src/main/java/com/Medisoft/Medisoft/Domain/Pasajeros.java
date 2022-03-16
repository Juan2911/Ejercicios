package com.Medisoft.Medisoft.Domain;

public class Pasajeros {
    private String nombre;
    private int tipoTarifa;

    public Pasajeros() {
    }

    public Pasajeros(String nombre, int tipoTarifa) {
        this.nombre = nombre;
        this.tipoTarifa = tipoTarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(int tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }
}
