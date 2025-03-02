package org.example.model;

public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor);
    }

    // Metodo para exibir informações da moeda
    @Override
    public void info() {
        System.out.printf("Euro: €%.2f \n", valor);
    }

    // Metodo para converter o valor da moeda em real
    @Override
    public double converter() {
        return valor * 5.99;
    }
}
