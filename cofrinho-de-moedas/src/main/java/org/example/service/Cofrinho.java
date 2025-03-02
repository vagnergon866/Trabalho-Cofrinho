package org.example.service;

import org.example.model.Moeda;

import java.util.ArrayList;

public class Cofrinho {

    ArrayList<Moeda> moedas = new ArrayList<>();

    // Metodo para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    // Metodo para listar moedas do cofrinho
    public void listagemMoedas() {
        if (!moedas.isEmpty()) {
            for (Moeda moeda : moedas) {
                moeda.info();
            }
        } else {
            System.out.println("O Cofrinho não contém moedas!");
        }
    }

    // Metodo para cálcular o valor total convertido em real
    public double totalConvertido() {
        double valorTotal = 0;

        for (Moeda moeda : moedas) {
            valorTotal += moeda.converter(); // Soma o total convertido
        }

        return valorTotal;
    }

    // Metodo para remover moedas
    public void remover(double valor) {
        boolean valorEncontrado = false;

        // Percorre a lista e remove as moedas que possuem o valor informado
        for (int i = 0; i < moedas.size(); i++) {
            if (moedas.get(i).valor == valor) {
                moedas.remove(i);
                valorEncontrado = true;
                i--; // Ajusta o indice após a remoção
            }
        }

        // Exibe mensagem de acordo com o resultado da remoção
        if (!valorEncontrado) {
            System.out.println("Valor não encontrado!");
        } else {
            System.out.printf("As moedas com o valor de %.2f foram removidas com sucesso! \n", valor);
        }
    }
}
