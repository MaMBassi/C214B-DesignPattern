package br.inatel.cdg.ordenar;

import java.util.ArrayList;

public abstract class SistemaOrdenarDados {
    protected AlgoritmoOrdenar algOrdenar;

    public ArrayList<Integer> ordenarDados(ArrayList<Integer> lista){
        return algOrdenar.ordenarDados(lista);
    }

    //Getter e Setter
    public AlgoritmoOrdenar getAlgOrdenar() {
        return algOrdenar;
    }

    public void setAlgOrdenar(AlgoritmoOrdenar algOrdenar) {
        this.algOrdenar = algOrdenar;
    }
}
