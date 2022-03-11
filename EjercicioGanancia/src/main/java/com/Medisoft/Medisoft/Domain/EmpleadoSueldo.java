package com.Medisoft.Medisoft.Domain;

public class EmpleadoSueldo {
    private String nombre;
    private double descuento;
    private double sueldoBruto;

    public EmpleadoSueldo() {
    }

    public EmpleadoSueldo(String nombre, double descuento, double sueldoBruto) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.sueldoBruto = sueldoBruto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
}
