package exercicios.ex2.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Banco {
    // Nome do banco:
    private String nome;

    // Criando o banco de dados:
    private final Map<Integer, ContaBancaria> banco = new HashMap<>();
    private final List<ContaBancaria> contas = new ArrayList<>();

    /*
    * Pelos estudos feitos no pacote "tests", é certo que criar dois
    * bancos de dados e adicionando os mesmos objetos não irão consumir o dobro
    * de memória, mas otimizará a velocidade do código, já que a busca num
    * HashMap é mais efetiva do que a ArrayList (algoritmos O(1) e O(n),
    * respectivamente), mas não é possível obter posições específicas
    * no HashMap (para isso, é preciso converter os valores do dicionário
    * para uma lista, operação cuja complexidade seria O(n), apenas para
    * buscar o primeiro elemento).
    * */

    public Banco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder(nome + ": [");
        for (ContaBancaria conta : contas) {
            st.append("\n").append(conta.toString().indent(4));
        }
        st.append("]");
        return st.toString();
    }

    public ContaBancaria getAccountByID(int ID) {
        return banco.get(ID);
    }

    public void cadastrarContas(ContaBancaria... contasBancarias) {
        for (ContaBancaria conta : contasBancarias) {
            if (!banco.containsKey(conta.getID())) {
                banco.putIfAbsent(conta.getID(), conta);
                contas.add(banco.get(conta.getID()));
            }
            else {
                System.out.printf("\u001b[1;31mConta %d já cadastrada.%n\u001b[m", conta.getID());
            }
        }
    }

    public double calcularMedia() {
        double media = 0;  // Criando a variável "média", que será somada com o saldo de cada conta cadastrada.
        for (ContaBancaria conta : banco.values()) {  // Percorrendo as contas;
            media += conta.getSaldo();  // Somando a variável "média";
        }
        double size = banco.size();  // Garantindo que o resultado da operação será um "double", e não um "integer";
        media /= size;  // Tirando a média aritmética;
        return media;  // retornando a média aritmética entre todos os saldos.
    }

    public double calcularMinimo() {
        /*
        Criando a variável "mínimo", cujo valor inicial será a primeira conta da lista,
        valor o qual será comparado com as demais:
        */
        double minimo = contas.get(0).getSaldo();
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() < minimo) {
                minimo = conta.getSaldo();
            }
        }
        return minimo;
    }

    public double calcularMaximo() {
        /*
        Criando a variável "maximo", cujo valor inicial será a primeira conta da lista,
        valor o qual será comparado com as demais:
        */
        double maximo = contas.get(0).getSaldo();
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maximo) {
                maximo = conta.getSaldo();
            }
        }
        return maximo;
    }

    public ContaBancaria getConta(int ID) {
        if (!banco.containsKey(ID)) {
            System.out.println("\u001b[1;31mERRO: Conta não encontrada.\u001b[m");
            return null;
        }

        return banco.get(ID);
    }
}
