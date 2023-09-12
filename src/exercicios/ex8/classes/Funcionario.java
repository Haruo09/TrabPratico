package exercicios.ex8.classes;

import java.time.LocalDate;
import java.time.Period;

public class Funcionario {
    private String nome;
    private char sexo;
    private String cargo;
    private double salario;
    private LocalDate dataNascimento;
    private LocalDate dataAdmissao;

    public Funcionario(
        String nome,
        char sexo,
        String cargo,
        double salario,
        LocalDate dataNascimento,
        LocalDate dataAdmissao
    ) {
        this.nome = nome;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
    }

    public String toString() {
        return String.format(
            """
            Nome: %s
            Idade: %d anos
            Sexo: %c
            Cargo: %s
            Salário: R$%,.2f
            Data de nascimento: %s,
            Data de admissão: %s
            """,
            nome,
            calcularIdade().getYears(),
            sexo,
            cargo,
            salario,
            dataNascimento,
            dataAdmissao.toString()
        );
    }

    public Period calcularTempoServico() {
        return Period.between(dataAdmissao, LocalDate.now());
    }

    public Period calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now());
    }

    public boolean estaAposentado() {
        if (sexo == 'F') {
            if (calcularTempoServico().getYears() >= 30) {
                // Retorna expressão booleana:
                return Period.between(dataNascimento, LocalDate.now()).getYears() >= 57;
            }
        }
        else {
            if (calcularTempoServico().getYears() >= 35) {
                // Retorna expressão booleana:
                return Period.between(dataNascimento, LocalDate.now()).getYears() >= 62;
            }
        }
        return false;
    }
}
