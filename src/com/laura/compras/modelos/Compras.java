package com.laura.compras.modelos;

public class Compras implements Comparable<Compras> {
    private String nombre;
    private double valor;

    public Compras(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra: nombre= " + nombre + "  -  " +
                "valor= " + valor;
    }

    @Override
    public int compareTo(Compras otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.valor));
    }
}
