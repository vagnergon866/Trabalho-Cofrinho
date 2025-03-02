package org.example.model;

public abstract class Moeda {
    public double valor;
    public int tipo;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void info();
    public abstract double converter();
}
