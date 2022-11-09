package br.inatel.cdg.ordenar;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        //Lista para ordenação
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(10);
        lista.add(5);
        lista.add(1);
        lista.add(25);

        System.out.println("Bem-vindo ao Sistema de Ordenação de Dados");
        System.out.println("Lista para ordenação: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //Menu
        while(flag) {
            System.out.println("");
            System.out.println("Escolha o Algoritmo de Ordenação: ");
            System.out.println("1 - Array Sort.");
            System.out.println("2 - Insertion Sort.");
            System.out.println("3 - Bubble Sort.");
            System.out.println("Sua opção: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("");
                    System.out.println("Array Sort");
                    ArraySort arraySort = new ArraySort();
                    ArrayList<Integer> ordenadoAS = new ArrayList<Integer>();
                    ordenadoAS = arraySort.ordenarDados(lista);
                    for (int i = 0; i < ordenadoAS.size(); i++) {
                        System.out.println(ordenadoAS.get(i));
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Insertion Sort");
                    InsertionSort insertionSort = new InsertionSort();
                    ArrayList<Integer> ordenadoIS = new ArrayList<Integer>();
                    ordenadoIS = insertionSort.ordenarDados(lista);
                    for (int i = 0; i < ordenadoIS.size(); i++) {
                        System.out.println(ordenadoIS.get(i));
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Bubble Sort");
                    BubbleSort bubbleSort = new BubbleSort();
                    ArrayList<Integer> ordenadoBS = new ArrayList<Integer>();
                    ordenadoBS = bubbleSort.ordenarDados(lista);
                    for (int i = 0; i < ordenadoBS.size(); i++) {
                        System.out.println(ordenadoBS.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Você saiu do sistema!");
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente!");
                    break;
            }
        }

    }
}
