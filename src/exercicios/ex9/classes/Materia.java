package exercicios.ex9.classes;

public class Materia {
    // Classe responsável por reter as informações de uma Matéria/Unidade Curricular.
    private String nome;
    private double peso;

    public Materia(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
