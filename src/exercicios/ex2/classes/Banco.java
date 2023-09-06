package exercicios.ex2.classes;

import java.util.HashMap;

public class Banco {
    private final HashMap<Integer, ContaBancaria> banco = new HashMap<>();

    public void cadastrarContas(ContaBancaria... contasBancarias) {
        for (ContaBancaria conta : contasBancarias) {
            if (!banco.containsKey(conta.getId())) {
                banco.put(conta.getId(), conta);
            }
        }
    }

    public double calcularMedia() {
        double media = 0;
        for (ContaBancaria conta : banco.values()) {
            media += conta.getSaldo();
        }
        double size = banco.size();
        media /= size;
        return media;
    }

    public double calcularMinimo() {
        double minimo = banco.get(0).getSaldo();
        for (ContaBancaria conta : banco.values()) {
            if (conta.getSaldo() < minimo) {
                minimo = conta.getSaldo();
            }
        }
        return minimo;
    }

    public double calcularMaximo() {
        double maximo = banco.get(0).getSaldo();
        for (ContaBancaria conta : banco.values()) {
            if (conta.getSaldo() > maximo) {
                maximo = conta.getSaldo();
            }
        }
        return maximo;
    }
}
