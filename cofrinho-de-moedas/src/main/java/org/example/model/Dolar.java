package org.example.model;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.printf("Dolar: $%.2f \n", valor);
    }

    @Override
    public double converter() {
        return valor * 5.73;
    }
}
