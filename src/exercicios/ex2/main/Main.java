package exercicios.ex2.main;

import exercicios.ex2.classes.Banco;
import exercicios.ex2.classes.ContaBancaria;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando o objeto banco:
        Banco bancoDoBrasil = new Banco("Banco do Brasil");

        // Cadastrando algumas contas bancárias:
        bancoDoBrasil.cadastrarContas(
            new ContaBancaria(
                1,
                "Fábio Haruo",
                1350,
                1200
            ),
            new ContaBancaria(
                2,
                "Maria Eduarda",
                1970.98,
                1500
            )
        );

        // Listando contas cadastradas:
        System.out.println(bancoDoBrasil);

        // Calculando a média de saldo:
        System.out.printf("Média: R$%,.2f%n", bancoDoBrasil.calcularMedia());

        // Calculando o menor saldo:
        System.out.printf("Menor saldo: R$%,.2f%n", bancoDoBrasil.calcularMinimo());

        // Calculando o maior saldo:
        System.out.printf("Maior saldo: R$%,.2f%n", bancoDoBrasil.calcularMaximo());

        // Realizando um saque:
        bancoDoBrasil.getConta(1).sacar(342.01);

        // Verificando o novo saldo:
        System.out.println(bancoDoBrasil.getConta(1));

        // Realizando um depósito:
        bancoDoBrasil.getConta(2).depositar(300.);

        // Verificando o novo saldo:
        System.out.println(bancoDoBrasil.getConta(2));

        // Tentando sacar além do limite:
        bancoDoBrasil.getConta(2).sacar(1500.01);  // saída: ERRO: Valor excedente ao limite.
        System.out.println(bancoDoBrasil.getConta(2));

        // Tentando obter uma conta inexistente:
        bancoDoBrasil.getConta(4);  // Saída: ERRO: Conta não enocntrada.

    }
}
