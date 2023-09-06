package exercicios.ex4.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Estoque {
    private final HashMap<Integer, Produto> estoque = new HashMap<>();

    public void adicionarProdutos(Produto... produtos) {
        for (Produto produto : produtos) {
            if (!estoque.containsKey(produto.getId()))
                estoque.put(produto.getId(), produto);
            else
                estoque
                    .get(produto.getId())
                    .setQuantidade(
                        estoque
                            .get(produto.getId())
                            .getQuantidade()
                            +
                            produto.getQuantidade()
                    );
        }
    }

    public double calcularMedia() {
        double media = 0;
        for (Produto produto : estoque.values()) {
            media += produto.getPreco();
        }
        double size = estoque.size();
        media /= size;
        return media;
    }

    public double calcularMinimo() {
        double minimo = estoque;
        for (Produto produto : estoque.values()) {

        }
    }
}
