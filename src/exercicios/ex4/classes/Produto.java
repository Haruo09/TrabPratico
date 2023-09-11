package exercicios.ex4.classes;

public class Produto {
    private final int ID;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int ID, String nome, double preco, int quantidade) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = Math.abs(quantidade);
    }

    public String toString() {
        return String.format(
            """
            ID: %d
            Nome: %s
            Preço: R$%,.2f
            Quantidade: %d
            """, ID, nome, preco, quantidade
        );
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
