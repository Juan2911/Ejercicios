package com.Medisoft.Medisoft.Domain;

public class ResultadoUnElemento {
    private Float numero;
    private Float potencia;

    public ResultadoUnElemento() {
    }

    public ResultadoUnElemento(Float numero, Float potencia) {
        this.numero = numero;
        this.potencia = potencia;
    }

    public Float getNumero() {
        return numero;
    }

    public void setNumero(Float numero) {
        this.numero = numero;
    }

    public Float getPotencia() {
        return potencia;
    }

    public void setPotencia(Float potencia) {
        this.potencia = potencia;
    }
}
