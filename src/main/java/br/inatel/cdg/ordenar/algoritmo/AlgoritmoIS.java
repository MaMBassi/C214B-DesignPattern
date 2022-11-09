package br.inatel.cdg.ordenar.algoritmo;

import br.inatel.cdg.ordenar.AlgoritmoOrdenar;

import java.util.ArrayList;

public class AlgoritmoIS implements AlgoritmoOrdenar {
    @Override
    public ArrayList<Integer> ordenarDados(ArrayList<Integer> lista) {
        for (int i = 1; i < lista.size(); i++){

            int aux = lista.get(i);
            int j = i - 1;

            while ((j >= 0) && (lista.get(j) > aux)){
                lista.set(j + 1, lista.get(j));
                j -= 1;
            }
            lista.set(j + 1, aux);
        }
        return lista;
    }
}
