package exercicios.ex6.main;

import exercicios.ex6.classes.Cadastro;
import exercicios.ex6.classes.Estudante;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando os estudantes:
        Estudante haruo = new Estudante(
                "40976037874",
                "Fábio Haruo",
                16,
                9.5, 8.9, 10
        );

        Estudante duda = new Estudante(
                "13948924627",
                "Maria Eduarda",
                17,
                8.7, 6.4, 7.0
        );

        Estudante joaozinho = new Estudante(
                "12345678910",
                "João Augusto Alberto Freire",
                27,
                3.4, 10, 1.4
        );

        // Instanciando o objeto cadastro:
        Cadastro cadastro = new Cadastro();

        // Cadastrando os estudantes:
        cadastro.cadastrarEstudante(haruo);
        cadastro.cadastrarEstudante(duda);
        cadastro.cadastrarEstudante(joaozinho);

        // Listando os estudantes cadastrados:
        System.out.println(cadastro);

        // Obs.: os métodos para calcular a média e verificar aprovação já são usados no toString().
    }
}
