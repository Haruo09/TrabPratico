package exercicios.ex9.classes;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    // Classe Responsável por reter informações a respeito de um curso.
    private String nome;
    private final List<Materia> curso = new ArrayList<>(); // matérias e os seus pesos;

    public Curso(String nome, Materia... materias) {
        this.nome = nome;
        for (Materia materia : materias) {
            if (!curso.contains(materia)) {
                curso.add(materia);
            }
        }
    }

    public double getNotaDeCorte() {
        double somaPesos = 0;
        for (Materia materia : curso) {
            somaPesos += materia.getPeso();
        }
        return (10*curso.size()/somaPesos)*.6;
    }

    public Curso(String nome) {
        this.nome = nome;
    }

    public void cadastrarMaterias(Materia... materias) {
        for (Materia materia : materias) {
            if (!curso.contains(materia)) {
                curso.add(materia);
            }
        }
    }

    public boolean contemMateria(String nomeMateria) {
        for (Materia materia : curso) {
            if (materia.getNome().equals(nomeMateria)) {
                return true;
            }
        }
        return false;
    }

    public double getPesoMateria(String nomeMateria) {
        for (Materia materia : curso) {
            if (materia.getNome().equals(nomeMateria)) {
                return materia.getPeso();
            }
        }
        return 0.;
    }

    public String getNome() {
        return nome;
    }

    public List<Materia> getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
