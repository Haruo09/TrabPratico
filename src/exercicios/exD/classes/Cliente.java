package exercicios.exD.classes;

import exercicios.ex1.classes.Pessoa;

import java.time.LocalTime;

public class Cliente extends Pessoa {
    // Herdando atributos e métodos da classe Pessoa, do ex1, e adicionando um novo: horaChegada;
    LocalTime horaChegada;
    public Cliente(String nome, int idade, char sexo, LocalTime horaChegada) {
        super(nome, idade, sexo);
        this.horaChegada = horaChegada;  // pedi como argumento para facilitar os testes;
    }

    public LocalTime getHoraChegada() {
        return horaChegada;
    }
}
