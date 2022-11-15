package br.inatel.cdg.impl;

import br.inatel.cdg.interf.iObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {
    private String frase;
    private List<Observador> leitores;
    private int qtdPalavraFrase, qtdPalavraParLetra, qtdPalavraM;

    public Observavel() {
        leitores = new ArrayList<Observador>();
        this.qtdPalavraM = 0;
        this.qtdPalavraFrase = 0;
        this.qtdPalavraParLetra = 0;
        this.frase = "";
    }

    @Override
    public void registraObservador(Observador obs) {
        leitores.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if(leitores.contains(obs))
            leitores.remove(obs);
    }

    @Override
    public void notificaObservadores(){
        for(Observador observador:leitores){
            observador.update(this);
        }
    }

    //Atualização
    private void notificaAlteracao() {
        notificaObservadores();
    }

    //Nova Frase
    public void novaFrase(String frase){
        //Atualizar a frase
        this.frase = frase;
        //Separar as palavras da frase
        String[] splitFrase = frase.split("\\s|\\.");
        //Calcular o total de palavras da frase
        this.qtdPalavraFrase = splitFrase.length;
        //Calcular total de palavras com quantidade par de caracteres
        qtdPalavraPar(splitFrase);
        //Calcular total de palavras primeira letra maiuscula
        qtdPalavraMaiuscula(splitFrase);
        //Notificar os novos valores
        notificaAlteracao();
    }

    //Calcular total de palavras com quantidade par de caracteres
    private void qtdPalavraPar(String[] frase){
        int qtdParPalavras = 0;
        for(String palavra : frase){
            if(palavra.length() % 2 == 0){
                qtdParPalavras++;
            }
        }
        this.qtdPalavraParLetra = qtdParPalavras;
    }

    //Calcular total de palavras letra maiuscula
    private void qtdPalavraMaiuscula(String[] frase){
        int qtdMaiuscula = 0;
        for(String palavra : frase){
            char letraInicial = palavra.charAt(0);
            String upperPalavra = palavra.toUpperCase();
            char letraUpper = upperPalavra.charAt(0);

            if(letraInicial == letraUpper){
                qtdMaiuscula++;
            }
        }
        this.qtdPalavraM = qtdMaiuscula;
    }

    //Getters e Setters
    public String getFrase() {
        return frase;
    }

    public List<Observador> getLeitores() {
        return leitores;
    }

    public int getQtdPalavraFrase() {
        return qtdPalavraFrase;
    }

    public int getQtdPalavraParLetra() {
        return qtdPalavraParLetra;
    }

    public int getQtdPalavraM() {
        return qtdPalavraM;
    }
}
