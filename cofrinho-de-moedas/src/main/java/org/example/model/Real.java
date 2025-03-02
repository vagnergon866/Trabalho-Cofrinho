package org.example.model;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }

    // Metodo para exibir informações da moeda
    @Override
    public void info() {
        System.out.printf("Real: R$%.2f \n", valor);
    }

    // Metodo para converter o valor da moeda em real
    @Override
    public double converter() {
        return valor; // O Real só retorna o valor
    }
}
