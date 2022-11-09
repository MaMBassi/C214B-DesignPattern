package br.inatel.cdg.ordenar.algoritmo;

import br.inatel.cdg.ordenar.AlgoritmoOrdenar;

import java.util.ArrayList;
import java.util.Collections;

public class AlgoritmoAS implements AlgoritmoOrdenar {
    @Override
    public ArrayList<Integer> ordenarDados(ArrayList<Integer> lista) {
        Collections.sort(lista);
        return lista;
    }
}
