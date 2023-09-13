package exercicios.exC.classes;

// Reciclagem de classes feita no Ex4:
import exercicios.ex4.classes.Estoque;
import exercicios.ex4.classes.Produto;

// Estruturas de dados:
import java.util.List;
import java.util.Map;

public class Venda extends Estoque {  // Venda no sentido de "barraca"
    // Herdando os diretamente os atributos:
    private final Map<Integer, Produto> estoque = super.getEstoque();
    private final List<Produto> produtos = super.getProdutos();

    public Venda() {
        super();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Venda = [");
        for (Produto produto : produtos) {
            string.append(("\n" + produto.toString()).indent(4));
        }
        string.append("]");
        return string.toString();
    }

    public double calcularValorVenda() {
        double soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }
        return soma;
    }

    public void aplicarDesconto(int idProduto) {
        // Regra usada: ter mais de 30 produtos em estoque => 15% de desconto.
        // (claramente sem criatividade para criar regras, mas não vem ao caso)
        if (!estoque.containsKey(idProduto)) {
            System.out.println("\u001b[1;31mERRO: Produto não encontrado.\u001b[m");
            return;
        }

        Produto p = estoque.get(idProduto);
        if (p.getQuantidade() >= 30) {
            p.setPreco(p.getPreco() - p.getPreco()*.15);
        } else {
            System.out.println("\u001b[1;31mNão foi possível aplicar desconto: Condições não atingidas.\u001b[m");
        }
    }
}
