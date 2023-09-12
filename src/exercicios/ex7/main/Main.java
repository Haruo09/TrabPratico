package exercicios.ex7.main;

import exercicios.ex7.classes.Carro;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando alguns carros:
        Carro unoQuatroPortasComEscada = new Carro(
            "Fiat",
            "Uno",
            1984,
            34_565.99
        );

        Carro hondaHRV = new Carro(
            "Honda",
            "HR-V",
            2019,
            89_082.87
        );

        // Imprimindo a dereciação de cada carro:
        System.out.printf(
            """
            %s %s: R$%,.2f
            %s %s: R$%,.2f
            """,
            unoQuatroPortasComEscada.getMarca(),
            unoQuatroPortasComEscada.getModelo(),
            unoQuatroPortasComEscada.calcularValorDepreciacao(),

            hondaHRV.getMarca(),
            hondaHRV.getModelo(),
            hondaHRV.calcularValorDepreciacao()
        );
    }
}
