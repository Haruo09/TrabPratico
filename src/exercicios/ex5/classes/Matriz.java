package exercicios.ex5.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matriz {
    int[][] matriz;

    public Matriz(int qtdElementosPorLinha, int... elementos) {
        int qtdLinhas = (int) elementos.length/qtdElementosPorLinha;
        matriz = new int[qtdLinhas][qtdElementosPorLinha];
        for (int i = 0; i < qtdLinhas; i++) {
            for (int j = 0; j < qtdElementosPorLinha; j++) {
                matriz[i][j] = elementos[j + i*qtdElementosPorLinha];
            }
        }
    }

    public String toString() {
        String st = "";
        for (int[] ints : matriz) {
            List<Integer> integers = new ArrayList<>();
            for (int anInt : ints) {
                integers.add(anInt);
            }
            st += integers.toString() + "\n";
        }
        return st;
    }

    public int calcularSomaDaMatriz() {
        int s = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                s += elemento;
            }
        }
        return s;
    }

    public int[][] getMatriz() {
        return matriz;
    }
}
