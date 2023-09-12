package exercicios.ex8.main;

import exercicios.ex8.classes.Funcionario;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando um funcionário:
        Funcionario randandano = new Funcionario(
            "Randandano",
            'M',
            "Entregador",
            2700.,
            LocalDate.of(1961, 7, 8),
            LocalDate.of(1981, 1, 1)
        );

        // Imprimindo as informações de Randandano abaixo:
        System.out.println(randandano);

        // Imprimindo os anos de serviço:
        System.out.println("Anos de serviço: " + randandano.calcularTempoServico().getYears());

        // Imprimindo se está aposentado:
        System.out.println("Está aposentado? " + randandano.estaAposentado());
        System.out.println(" ");

        // Instanciando outro funcionário:
        Funcionario neide = new Funcionario(
            "Neide da Silva",
            'F',
            "Chef de Cozinha",
            2500.,
            LocalDate.of(1998, 7, 30),
            LocalDate.of(2006, 9, 29)
        );

        // Imprimindo as informações de Neide abaixo:
        System.out.println(neide);

        // Imprimindo os anos de serviço:
        System.out.println("Anos de serviço: " + neide.calcularTempoServico().getYears());

        // Imprimindo se está aposentado:
        System.out.println("Está aposentada? " + neide.estaAposentado());
        System.out.println(" ");
    }
}
