package org.example.model;

public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("Euro: €%.2f \n", valor);
    }

    @Override
    public double converter() {
        return valor * 5.99;
    }
}
