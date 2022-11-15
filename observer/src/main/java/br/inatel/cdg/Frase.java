package br.inatel.cdg;

import br.inatel.cdg.impl.Observador;
import br.inatel.cdg.impl.Observavel;

public class Frase {
    public static void main(String[] args) {
        //Observavel
        Observavel obsFrase = new Observavel();

        //Observadores
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        Observador obs4 = new Observador(4);

        //Registrar observadores
        obsFrase.registraObservador(obs1);
        obsFrase.registraObservador(obs2);
        obsFrase.registraObservador(obs3);
        obsFrase.registraObservador(obs4);

        //Remover observador 04
        obsFrase.removeObservador(obs4);

        //Notificações
        //Frase 01
        obsFrase.novaFrase("Teste para separar palavras");
        //Frase 02
        obsFrase.novaFrase("Mudanca de Frase");

    }
}
