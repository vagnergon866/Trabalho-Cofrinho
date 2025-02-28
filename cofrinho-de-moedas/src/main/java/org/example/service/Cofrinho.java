package org.example.service;

import org.example.moeda.Moeda;

import java.util.ArrayList;

public class Cofrinho {

    ArrayList<Moeda> moedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    public void listagemMoedas() {
        if (!moedas.isEmpty()) {
            for (Moeda moeda : moedas) {
                moeda.info();
            }
        } else {
            System.out.println("O Cofrinho não contem moedas!");
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
        boolean valorEncontrado = false;

        for (int i = 0; i < moedas.size(); i++) {
            if (moedas.get(i).valor == valor) {
                moedas.remove(i);
                valorEncontrado = true;
                i--;
            }
        }

        if (!valorEncontrado) {
            System.out.println("Valor não encontrado!");
        } else {
            System.out.printf("As moedas com o valor de R$%.2f foram removidas com sucesso! \n", valor);
        }
    }
}
