package org.example.service;

import org.example.moeda.Moeda;

import java.util.ArrayList;
import java.util.Iterator;


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

   /* public void remover(int tipo, double valor) {
        Iterator<Moeda> iterator = moedas.iterator();
        while (iterator.hasNext()) {
            Moeda moeda = iterator.next();
            if (moeda.getValor() == valor) {
                iterator.remove();
                System.out.println("Moeda removida: " + tipo + " - " + valor);
                return;
            }
        }
        System.out.println("Moeda não encontrada: " + tipo + " - " + valor);
    }*/
}
