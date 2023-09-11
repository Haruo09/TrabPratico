package exercicios.ex4.main;

import exercicios.ex4.classes.Estoque;
import exercicios.ex4.classes.Produto;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando produtos:
        Produto batom = new Produto(10, "batom", 10., 10);
        Produto perfume = new Produto(20, "Perfume", 700., 1500);
        Produto oculos = new Produto(30, "Óculos", 30.99, 63);

        // Instanciando um Estoque:
        Estoque estoque = new Estoque();

        // Cadastrando os produtos no estoque:
        estoque.adicionarProdutos(batom, perfume, oculos);

        // Imprimindo o estoque:
        System.out.println(estoque);

        // Calculando as médias:
        System.out.printf(
            """
            Média de preços: %,.2f
            Média de quantidades: %,.2f
            
            Menor preço: %,.2f
            Menor quantidade: %d
            
            Maior preço: %,.2f
            Maior quantidade: %d
            """,
            estoque.calcularMediaPrecos(),
            estoque.calcularQuantidadeMedia(),
            estoque.calcularMinimoPrecos(),
            estoque.calcularMinimoQuantidade(),
            estoque.calcularMaximoPrecos(),
            estoque.calcularMaximoQuantidade()
        );

        // Alterando informações de um produto:
        estoque.alterarProduto(10, null, 0, 27);

        // Imprimindo as informações do produto:
        System.out.println(estoque.getProduto(10));
    }
}
