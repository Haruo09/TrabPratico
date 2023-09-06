 package exercicios.ex1.main;

import exercicios.ex1.classes.Cadastro;
import exercicios.ex1.classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        // Instanciando objetos da classe Pessoa:
        Pessoa duda = new Pessoa(
            "Dudaa",
            17,
             'F'   // "F" de feijão
        );

        Pessoa haruo = new Pessoa(
            "Haruo",
            16,
            'M'
        );

        // Instanciando o objeto cadastro:
        Cadastro cadastro = new Cadastro();

        // Cadastrando as pessoas:
        cadastro.cadastrar(duda, haruo);

        // Listando as pessoas cadastradas:
        cadastro.listarCadastros();

        // Editando um cadastro:
        cadastro.editarCadastro(
            haruo,
            "Fábio Haruo",
            17,
            'A'  // a Duda quis colocar "A" de Arroz
        );

        // Verificando a mudança:
        cadastro.listarCadastros();

    }
}
