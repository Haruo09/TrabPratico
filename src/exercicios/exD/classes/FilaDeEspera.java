package exercicios.exD.classes;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Queue;

public class FilaDeEspera {
    private final Queue<Cliente> fila = new ArrayDeque<>();
    private LocalTime horarioInicio;
    private Duration tempoPassado;
    private int atendidos = 0;

    public FilaDeEspera(LocalTime horarioInicio) {
        // Semanticamente, faria mais sentido colocar direto LocalTime.now(),
        // mas resolvi colocar a hora de início como argumento para facilitar
        // os testes.
        this.horarioInicio = horarioInicio;
    }

    public void adicionarNaFila(Cliente cliente) {
        fila.add(cliente);  // A estrutura Queue automaticamente adiciona ao final da lista;
    }

    public void atenderCliente(LocalTime horarioAtendimento) {
        tempoPassado = Duration.between(horarioInicio, horarioAtendimento).abs();  // atualiza o tempo passado;
        atendidos += 1;
        fila.remove();  // A estrutura Queue automaticamente remove elementos ao início da lista;
    }

    public Duration calcularTempoMedioDeEspera() {  // nome gigantesco, mas tudo bem
        return tempoPassado.dividedBy(atendidos);
    }

    public Queue<Cliente> getFila() {
        return fila;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public Duration getTempoPassado() {
        return tempoPassado;
    }

    public int getAtendidos() {
        return atendidos;
    }
}
