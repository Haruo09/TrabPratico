package exercicios.ex9.classes;


import java.util.HashMap;
import java.util.Map;

public class Aluno {
    // Classe responsável por armazenar informações de um aluno;
    private String nome;
    private final int matricula;
    private Curso curso;
    private final Map<String, Double> notas = new HashMap<>();  // notas referentes às matérias;
    private int faltas;

    public Aluno(String nome, int matricula, Curso curso, int faltas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.faltas = faltas;
    }

    public void cadastrarNota(String nomeMateria, double nota) {
        if (curso.contemMateria(nomeMateria)) {
            notas.put(nomeMateria, nota);
        } else {
            System.out.println("\u001b[1;31mErro: matéria inexistente.\u001b[m");
            System.out.println("\u001b[1;33mCertifique-se de inserir a matéria no formato capitalizado.\u001b[m");
        }
    }

    public double getMediaGeral() {
        double somaPesos = 0.;
        double somaNotas = 0.;
        for (String key : notas.keySet()) {
            somaNotas += notas.get(key);
            somaPesos += curso.getPesoMateria(key);
        }
        return somaNotas/somaPesos;
    }

    public boolean estaAprovado() {
        // Retorna valor da expressão boolena:
        return (this.getMediaGeral() >= curso.getNotaDeCorte() && faltas < 20);
    }

    public int getMatricula() {
        return matricula;
    }

    public Map<String, Double> getNotas() {
        return notas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
