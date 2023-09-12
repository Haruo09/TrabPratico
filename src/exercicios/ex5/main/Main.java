package exercicios.ex5.main;

import exercicios.ex5.classes.Matriz;

public class Main {
    public static void main(String[] args) {
        // Instanciando a matriz:
        Matriz matriz = new Matriz(3,
            1, 2, 3, 4, 5, 6, 7, 8, 9
        );

        // Imprimindo a matriz:
        System.out.println(matriz);

        // Calculando os elementos:
        System.out.println("Soma = " + matriz.calcularSomaDaMatriz());
    }
}
