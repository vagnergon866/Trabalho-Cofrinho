package org.example.model;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    // Metodo para exibir informações da moeda
    @Override
    public void info() {
        System.out.printf("Dolar: $%.2f \n", valor);
    }

    // Metodo para converter o valor da moeda em real
    @Override
    public double converter() {
        return valor * 5.73;
    }
}
