package org.example.service;

import org.example.moeda.Moeda;

import java.util.ArrayList;


public class Cofrinho {
    ArrayList<Moeda> moedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    public void listagemMoedas() {
        for (Moeda moeda : moedas) {
            moeda.info();
        }
    }

    public double totalConvertido() {
        double valorTotal = 0;
        for (Moeda moeda : moedas) {
            valorTotal += moeda.converter();
        }
        return valorTotal;
    }

    public void remover(double valor) {
        for (int i = 0; i < moedas.size(); i++) {
            if (moedas.get(i).valor == valor) {
                moedas.remove(i);
                i--;
            }
        }
    }
}
