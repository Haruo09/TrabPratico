package exercicios.exB.main;

import exercicios.exB.classes.Circulo;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando um círculo:
        Circulo circulo = new Circulo(5, "Roxo");

        // Imprimindo as informações do círculo:
        System.out.printf("Cor: %s%n", circulo.getCor());
        System.out.printf("Raio: %,.2f%n", circulo.getRaio());
        System.out.printf("Área: %,.2f%n", circulo.getArea());
        System.out.printf("Perímetro: %,.2f%n", circulo.getPerimetro());

    }
}
