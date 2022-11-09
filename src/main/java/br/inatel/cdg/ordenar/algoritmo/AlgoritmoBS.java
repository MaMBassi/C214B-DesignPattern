package br.inatel.cdg.ordenar.algoritmo;

import br.inatel.cdg.ordenar.AlgoritmoOrdenar;

import java.util.ArrayList;

public class AlgoritmoBS implements AlgoritmoOrdenar {
    @Override
    public ArrayList<Integer> ordenarDados(ArrayList<Integer> lista) {
        int i; //contadores
        int j = 0;
        int trab;
        boolean troca;
        int limite;

        troca = true;
        limite = lista.size() - 1;
        while(troca)
        {
            troca = false;
            for(i = 0; i < limite; i++)
                if(lista.get(i) > lista.get(i + 1))
                {
                    trab = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, trab);
                    j = i;
                    troca = true;
                }
            limite = j;
        }
        return lista;
    }
}
