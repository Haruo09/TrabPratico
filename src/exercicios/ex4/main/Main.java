package exercicios.ex4.main;

import exercicios.ex4.classes.Produto;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando produtos:
        Produto batom = new Produto("batom", 10., 10);
        Produto perfume = new Produto("Perfume", 700., 1500);
        Produto oculos = new Produto("Óculos", 30.99, 63);


    }
}
