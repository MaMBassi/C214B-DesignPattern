package br.inatel.cdg.teste.ordenar;

import br.inatel.cdg.ordenar.ArraySort;
import br.inatel.cdg.ordenar.BubbleSort;
import br.inatel.cdg.ordenar.InsertionSort;
import br.inatel.cdg.ordenar.SistemaOrdenarDados;
import br.inatel.cdg.ordenar.algoritmo.AlgoritmoAS;
import br.inatel.cdg.ordenar.algoritmo.AlgoritmoBS;
import br.inatel.cdg.ordenar.algoritmo.AlgoritmoIS;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSistemaOrdenarDados {
    SistemaOrdenarDados sistemaOrdenarDados;

    @Test
    public void testeArraySort() {
        sistemaOrdenarDados = new ArraySort();
        assertTrue(sistemaOrdenarDados.getAlgOrdenar() instanceof AlgoritmoAS);
    }

    @Test
    public void testeInsertionSort() {
        sistemaOrdenarDados = new InsertionSort();
        assertTrue(sistemaOrdenarDados.getAlgOrdenar() instanceof AlgoritmoIS);
    }

    @Test
    public void testeBubbleSort() {
        sistemaOrdenarDados = new BubbleSort();
        assertTrue(sistemaOrdenarDados.getAlgOrdenar() instanceof AlgoritmoBS);
    }

    @Test
    public void testeArraySortResultado() {
        sistemaOrdenarDados = new ArraySort();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(20);
        listaTeste.add(4);
        listaTeste.add(10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(4);
        resultadoTeste.add(10);
        resultadoTeste.add(20);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

    @Test
    public void testeInsertionSortResultado() {
        sistemaOrdenarDados = new InsertionSort();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(20);
        listaTeste.add(4);
        listaTeste.add(10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(4);
        resultadoTeste.add(10);
        resultadoTeste.add(20);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

    @Test
    public void testeBubbleSortResultado() {
        sistemaOrdenarDados = new BubbleSort();
        ArrayList<Integer> listaTeste = new ArrayList<>();
        listaTeste.add(20);
        listaTeste.add(4);
        listaTeste.add(10);
        ArrayList<Integer> resultadoTeste = new ArrayList<>();
        resultadoTeste.add(4);
        resultadoTeste.add(10);
        resultadoTeste.add(20);

        ArrayList<Integer> resultado = sistemaOrdenarDados.ordenarDados(listaTeste);
        assertEquals(resultado, resultadoTeste);
    }

}
