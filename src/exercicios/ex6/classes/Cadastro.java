package exercicios.ex6.classes;

import java.util.HashMap;
import java.util.Map;

public class Cadastro {
    private final Map<String , Estudante> estudantes = new HashMap<>();

    public String toString() {
        String st = "";
        for (Estudante estudante : estudantes.values()) {
            st += estudante.toString() + "--------------------------\n";
        }
        return st;
    }

    public void cadastrarEstudante(Estudante estudante) {
        if (estudantes.containsKey(estudante.getCpf())) {
            System.out.println("\u001b[1;31mErro: Estudante já cadastrado\u001b[m");
            return;
        }
        estudantes.put(estudante.getCpf(), estudante);
    }

    public Estudante getEstudante(String cpf) {
        return estudantes.get(cpf);
    }
}
