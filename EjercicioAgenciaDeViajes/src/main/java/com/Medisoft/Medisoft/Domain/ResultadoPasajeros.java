package com.Medisoft.Medisoft.Domain;

public class ResultadoPasajeros {
    private String nombre;
    private String DescripcionDeTarifa;
    private double tarifa;

    public ResultadoPasajeros() {
    }

    public ResultadoPasajeros(String nombre, String DescripcionDeTarifa, double tarifa) {
        this.nombre = nombre;
        this.DescripcionDeTarifa = DescripcionDeTarifa;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionDeTarifa() {
        return DescripcionDeTarifa;
    }

    public void setDescripcionDeTarifa(String DescripcionDeTarifa) {
        this.DescripcionDeTarifa = DescripcionDeTarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
}
