package com.laura.compras.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarjetaCredito {
    private double saldo;
    private double limite;
    private List<Compras> compras;

    public TarjetaCredito(Double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean registrarCompra(Compras compra) {
        if (this.saldo < compra.getValor()) {
            return false;
        }else {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
    }

    public void mostrarCompras() {
        if (compras.isEmpty()){
            System.out.println("No se han realizado compras.");
        }else {
            System.out.println("Compras realizadas:");
            Collections.sort(compras);
            for (Compras compra : compras) {
                System.out.println(compra);
            }
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compras> getCompras() {
        return compras;
    }
}
