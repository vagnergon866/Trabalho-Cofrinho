package org.example;

import org.example.moeda.Dolar;
import org.example.moeda.Euro;
import org.example.moeda.Moeda;
import org.example.moeda.Real;
import org.example.service.Cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("-----------------------------");
            System.out.println("Cofrinho:");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Listar Moedas");
            System.out.println("3 - Calcular total convertido");
            System.out.println("4 - Remover Moeda");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            System.out.println("-----------------------------");

            if (opcao < 0 || opcao > 4) {
                System.out.println("Opção inválida!");
            }

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de Moeda:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");
                    System.out.print("Opção: ");

                    int tipoMoeda = teclado.nextInt();

                    if (tipoMoeda < 1 || tipoMoeda > 3) {
                        System.out.println("Opção inválida!");
                        break;
                    }

                    System.out.print("Digite o valor: ");
                    double valor = teclado.nextDouble();

                    Moeda moeda = null;
                    switch (tipoMoeda) {
                        case 1 -> moeda = new Real(valor);
                        case 2 -> moeda = new Dolar(valor);
                        case 3 -> moeda = new Euro(valor);
                    }
                    cofrinho.adicionar(moeda);
                    break;

                case 2:
                    System.out.println("Lista de Moedas: ");
                    cofrinho.listagemMoedas();
                    break;

                case 3:
                    System.out.printf("Valor total convertido: R$%.2f \n", cofrinho.totalConvertido());
                    break;

                case 4:
                    System.out.println("Digite o valor correspondente as moedas que quer remover: ");
                    valor = teclado.nextDouble();
                    cofrinho.remover(valor);
                    break;
            }
        }
    }
}

