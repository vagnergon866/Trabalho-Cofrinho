package org.example;

import org.example.model.Dolar;
import org.example.model.Euro;
import org.example.model.Moeda;
import org.example.model.Real;
import org.example.service.Cofrinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao = -1;

        // Loop do menu principal
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

            // Verifica se a opção escolhida do Menu é válida
            if (opcao < 0 || opcao > 4) {
                System.out.println("Opção inválida!");
            }

            switch (opcao) {
                case 1: // Adiciona uma nova moeda ao cofrinho
                    System.out.println("Escolha o tipo de Moeda:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");
                    System.out.print("Opção: ");

                    int tipoMoeda = teclado.nextInt();

                    // Verifica se o tipo de moeda é válido
                    if (tipoMoeda < 1 || tipoMoeda > 3) {
                        System.out.println("Opção inválida!");
                        break;
                    }

                    System.out.print("Digite o valor: ");
                    double valor = teclado.nextDouble();

                    // Criando o Objeto Moeda
                    Moeda moeda = null;
                    switch (tipoMoeda) {
                        case 1 -> moeda = new Real(valor);
                        case 2 -> moeda = new Dolar(valor);
                        case 3 -> moeda = new Euro(valor);
                    }

                    //Adicionando a moeda ao cofrinho
                    cofrinho.adicionar(moeda);
                    break;

                case 2: // Lista as moedas adicionadas
                    System.out.println("Lista de Moedas: ");
                    cofrinho.listagemMoedas();
                    break;

                case 3: // Cálcula o valor total de moedas convertidas para real
                    System.out.printf("Valor total convertido: R$%.2f \n", cofrinho.totalConvertido());
                    break;

                case 4: // Remove todas as moedas que tenham o valor informado
                    System.out.println("Digite o valor correspondente as moedas que quer remover: ");
                    valor = teclado.nextDouble();
                    cofrinho.remover(valor);
                    break;
            }
        }
    }
}

