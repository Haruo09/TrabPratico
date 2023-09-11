package exercicios.ex4.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Estoque {
    private final HashMap<Integer, Produto> estoque = new HashMap<>();
    private final List<Produto> produtos = new ArrayList<>();

    public String toString() {
        String string = "Estoque = [";
        for (Produto produto : produtos) {
            string += new String("\n" + produto.toString()).indent(4);
        }
        string += "]";
        return string;
    }

    public void adicionarProdutos(Produto... produtos) {
        for (Produto produto : produtos) {
            if (!estoque.containsKey(produto.getID())) {
                estoque.put(produto.getID(), produto);
                this.produtos.add(produto);
            }
            else {  // A legibilidade não ficou das melhores, mas basicamente soma com a quantidade já existente.
                estoque
                    .get(produto.getID())
                    .setQuantidade(
                        estoque
                            .get(produto.getID())
                            .getQuantidade()
                            +
                            produto.getQuantidade()
                    );
            }
        }
    }

    public double calcularMediaPrecos() {
        if (estoque.isEmpty()) return 0.;  // retorna 0 caso o estoque esteja vazio;

        double mediaPrecos = 0;
        for (Produto produto : produtos) {
            mediaPrecos += produto.getPreco();
        }
        double size = estoque.size();
        mediaPrecos /= size;
        return mediaPrecos;
    }

    public double calcularQuantidadeMedia() {
        if (estoque.isEmpty()) return 0.;  // retorna 0 caso o estoque esteja vazio;

        double mediaQtd = 0;
        for (Produto produto : produtos) {
            mediaQtd += produto.getQuantidade();
        }
        double size = estoque.size();
        mediaQtd /= size;
        return mediaQtd;
    }

    public double calcularMinimoPrecos() {
        if (estoque.isEmpty())  return 0.;

        double minimoPrecos = produtos.get(0).getPreco();
        for (Produto produto : produtos) {
            if (produto.getPreco() < minimoPrecos) {
                minimoPrecos = produto.getPreco();
            }
        }
        return minimoPrecos;
    }

    public int calcularMinimoQuantidade() {
        if (estoque.isEmpty()) return 0;

        int minimoPrecos = produtos.get(0).getQuantidade();
        for (Produto produto : produtos) {
            if (produto.getQuantidade() < minimoPrecos) {
                minimoPrecos = produto.getQuantidade();
            }
        }
        return minimoPrecos;
    }

    public double calcularMaximoPrecos() {
        if (estoque.isEmpty()) return 0.;

        double maximoPrecos = produtos.get(0).getPreco();
        for (Produto produto : produtos) {
            if (produto.getPreco() > maximoPrecos) {
                maximoPrecos = produto.getPreco();
            }
        }
        return maximoPrecos;
    }

    public int calcularMaximoQuantidade() {
        if (estoque.isEmpty()) return 0;

        int maximoQtd = produtos.get(0).getQuantidade();
        for (Produto produto : produtos) {
            if (produto.getQuantidade() > maximoQtd) {
                maximoQtd = produto.getQuantidade();
            }
        }
        return maximoQtd;
    }

    public void alterarProduto(int ID, String novoNome, double novoPreco, int novaQtd) {
        if (!estoque.containsKey(ID)) {
            System.out.println("\u001b[1;31mERRO: Produto não encontrado.\u001b[m");
            return;
        }
        if (novoNome == null) novoNome = estoque.get(ID).getNome();
        if (novoPreco == 0) novoPreco = estoque.get(ID).getPreco();
        if (novaQtd == -1) novaQtd = estoque.get(ID).getQuantidade();

        estoque.get(ID).setNome(novoNome);
        estoque.get(ID).setPreco(novoPreco);
        estoque.get(ID).setQuantidade(novaQtd);
    }

    public Produto getProduto(int ID) {
        if (!estoque.containsKey(ID)) {
            System.out.println("\u001b[1;31mERRO: Produto não encontrado.\u001b[m");
            return null;
        }
        return estoque.get(ID);
        // "else" desnecessário, já que o método para assim que encontra um return.
    }
}
