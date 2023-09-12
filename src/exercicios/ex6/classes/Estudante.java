package exercicios.ex6.classes;

public class Estudante {
    private final String cpf;  // Primary Key;
    private String nome;
    private int idade;
    private double[] notas;

    public Estudante(String cpf, String nome, int idade, double... notas) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public String toString() {
        return String.format(
            """
            Nome: %s
            Idade: %d
            Média: %.2f
            Aprovado: %b
            """,
            nome,
            idade,
            calcularMediaNotas(),
            verificarAprovacao()
        );
    }

    public double calcularSomaNotas() {
        double soma = 0.;
        for (double nota : notas) {
            soma += nota;
        }
        return soma;
    }

    public double calcularMediaNotas() {
        return calcularSomaNotas() / notas.length;
    }

    public boolean verificarAprovacao() {
        // Retorna o valor da expressão booleana:
        return calcularMediaNotas() >= 6;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
