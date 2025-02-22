package org.example;

import org.example.moeda.Dolar;
import org.example.moeda.Euro;
import org.example.moeda.Real;
import org.example.service.Cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        cofrinho.adicionar(new Dolar(1));
        cofrinho.adicionar(new Dolar(1));
        cofrinho.adicionar(new Real(1));
        cofrinho.adicionar(new Euro(1));

        cofrinho.listagemMoedas();
        cofrinho.totalConvertido();

        System.out.printf("Valor total no cofrinho: R$%.2f \n", cofrinho.totalConvertido());



    }
}