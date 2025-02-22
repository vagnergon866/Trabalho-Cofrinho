package org.example.moeda;

public abstract class Moeda {
    public double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void info();
    public abstract double converter();
}
