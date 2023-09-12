package exercicios.ex9.main;

import exercicios.ex9.classes.Aluno;
import exercicios.ex9.classes.Curso;
import exercicios.ex9.classes.Materia;

import java.awt.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando um curso:
        Curso informatica = new Curso("Informática");

        // Cadastrando matérias no curso:
        informatica.cadastrarMaterias(
            // Sem desmerecer nada nem ninguém, amo (apesar de não igualmente)
            // todas as matérias abaixo, estou apenas sendo coerente com o assunto
            new Materia("Laboratório de Programação II", 1),
            new Materia("Matemática", 1),
            new Materia("Português", .8),
            new Materia("Geografia", .7),
            new Materia("História", .7),
            new Materia("Biologia", .6)
        );

        // Instanciando alunos:
        Aluno haruo = new Aluno(
            "Fábio Haruo",
            2080,
            informatica,
            10
        );
        Aluno duda = new Aluno(
            "Maria Eduarda",
            2081,
            informatica,
            0
        );
        Aluno joaozinho = new Aluno(
            "Joãozinho",
            1,
            informatica,
            0
        );
        Aluno total = new Aluno(
            "Totalitário",
            0,
            informatica,
            21
        );

        // Cadastrando notas:
        haruo.cadastrarNota("Laboratório de Programação II", 10);
        haruo.cadastrarNota("Matemática", 10);
        haruo.cadastrarNota("Português", 8);
        haruo.cadastrarNota("Geografia", 6.8);
        haruo.cadastrarNota("História", 10);
        haruo.cadastrarNota("Biologia", 8);

        duda.cadastrarNota("Laboratório de Programação II", 7);
        duda.cadastrarNota("Matemática", 6.4);
        duda.cadastrarNota("Português", 8.9);
        duda.cadastrarNota("Geografia", 7.3);
        duda.cadastrarNota("História", 7);
        duda.cadastrarNota("Biologia", 8.5);

        joaozinho.cadastrarNota("Laboratório de Programação II", 2.0);
        joaozinho.cadastrarNota("Matemática", 3.4);
        joaozinho.cadastrarNota("Português", 6.9);
        joaozinho.cadastrarNota("Geografia", 7.3);
        joaozinho.cadastrarNota("História", 2);
        joaozinho.cadastrarNota("Biologia", 1.5);

        total.cadastrarNota("Laboratório de Programação II", 10);
        total.cadastrarNota("Matemática", 10);
        total.cadastrarNota("Português", 10);
        total.cadastrarNota("Geografia", 10);
        total.cadastrarNota("História", 10);
        total.cadastrarNota("Biologia", 10);

         // Imprimindo nota de corte:
        System.out.println("Nota de corte: " + informatica.getNotaDeCorte());
        System.out.println(" ");

        // Verificando aprovação:
        System.out.println("Haruo aprovado? " + haruo.estaAprovado());
        System.out.println("Média: " + haruo.getMediaGeral());
        System.out.println("Faltas: " + haruo.getFaltas());

        System.out.println(" ");

        System.out.println("Duda aprovada? " + duda.estaAprovado());
        System.out.println("Média: " + duda.getMediaGeral());
        System.out.println("Faltas: " + duda.getFaltas());

        System.out.println(" ");

        System.out.println("Joãozinho aprovado? " + joaozinho.estaAprovado());
        System.out.println("Média: " + joaozinho.getMediaGeral());
        System.out.println("Faltas: " + joaozinho.getFaltas());

        System.out.println(" ");

        System.out.println("Total aprovado? " + total.estaAprovado());
        System.out.println("Média: " + total.getMediaGeral());
        System.out.println("Faltas: " + total.getFaltas());

        // Obs.: Critério: Média acima de 60% e ter até 20 faltas.
    }
}
