package exercicios.exD.main;

import exercicios.exD.classes.Cliente;
import exercicios.exD.classes.FilaDeEspera;

import java.time.LocalTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando Clientes:
        Cliente haruo = new Cliente(
            "Fábio Haruo",
            16,
            'M',
            LocalTime.of(21, 0)
        );

        Cliente duda = new Cliente(
            "Maria Eduarda",
            17,
            'F',
            LocalTime.of(21, 20)
        );

        // Instanciando a fila:
        FilaDeEspera fila = new FilaDeEspera(LocalTime.of(21, 0));

        // Cadastrando os clientes na fila:
        fila.adicionarNaFila(haruo);
        fila.adicionarNaFila(duda);

        // Imprimindo a fila:
        System.out.println(fila.getFila());

        // Atendendo os clientes:
        fila.atenderCliente(LocalTime.of(21, 20));  // Atendendo Haruo;
        fila.atenderCliente(LocalTime.of(21, 40));  // Atendendo Duda;

        // Imprimindo novamente a fila (que deve estar vazia):
        System.out.println(fila.getFila());  // Saída: []

        // Calculando tempo médio de espera (que deve ser de 20min):
        System.out.printf("Tempo médio de espera: %s", fila.calcularTempoMedioDeEspera().toString());
    }
}
