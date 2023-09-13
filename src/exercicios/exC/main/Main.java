package exercicios.exC.main;

import exercicios.ex4.classes.Produto;
import exercicios.exC.classes.Venda;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando a venda:
        Venda venda = new Venda();

        // Instanciando produtos:
        Produto batom = new Produto(10, "batom", 10., 10);
        Produto perfume = new Produto(20, "Perfume", 700., 1500);
        Produto oculos = new Produto(30, "Óculos", 30.99, 63);
        // Isto se chama poupar tempo: não é plágio copiar de si mesmo não é plágio

        // Adicionando os produtos na venda:
        venda.adicionarProdutos(batom, perfume, oculos);

        // Imprimindo os produtos da venda:
        System.out.println(venda);

        // Imprimindo valor da venda:
        System.out.printf("Valor da venda: %,.2f%n", venda.calcularValorVenda());

        // Tentando aplicar desconto:
        venda.aplicarDesconto(10);
        venda.aplicarDesconto(20);
        venda.aplicarDesconto(30);

        // Imprimindo novamente os produtos da venda:
        System.out.println(venda);
        System.out.printf("Novo valor da venda: %,.2f", venda.calcularValorVenda());
    }
}
