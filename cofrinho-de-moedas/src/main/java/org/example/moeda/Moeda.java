package org.example.moeda;

public abstract class Moeda {
    public double valor;
    public int tipo;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public abstract void info();
    public abstract double converter();
}
