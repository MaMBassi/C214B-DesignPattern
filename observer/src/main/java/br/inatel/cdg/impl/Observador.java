package br.inatel.cdg.impl;

import br.inatel.cdg.interf.iObservador;

public class Observador implements iObservador {

    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel frase) {
        System.out.println("Frase: " + frase.getFrase());
        System.out.println("Quantidade de palavras: " + frase.getQtdPalavraFrase());
        System.out.println("Quantidade de palavras com numero par de caracteres: " + frase.getQtdPalavraParLetra());
        System.out.println("Quantidade de palavras com a primeira letra Maiuscula: " + frase.getQtdPalavraM());
    }
}
