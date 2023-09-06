package exercicios.ex3.main;

import exercicios.ex3.classes.Triangulo;

public class Main {
    public static void main(String[] args) {
        // Instanciando um triângulo:
        Triangulo triangulo = new Triangulo(3, 3, 3);

        // Obtendo o tipo do triângulo:
        System.out.println(triangulo.verificarTipo());

        // Alterando as informações do triângulo:
        triangulo.setLados(4, 9, 4);

        // Obtendo o novo tipo do triângulo:
        System.out.println(triangulo.verificarTipo());

        // Alterando as informações do triângulo novamente:
        triangulo.setLados(3, 4, 5);

        // Obtendo o novo tipo do triângulo:
        System.out.println(triangulo.verificarTipo());
    }
}
