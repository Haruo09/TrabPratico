package exercicios.ex1.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cadastro {
    private final List<Pessoa> cadastro = new ArrayList<>();

    public void cadastrar(Pessoa... pessoas) {
        cadastro.addAll(Arrays.asList(pessoas));
    }

    public void editarCadastro(
        Pessoa pessoa,
        String novoNome,
        int novaIdade,
        char novoSexo
    ) {
        int i = cadastro.indexOf(pessoa);
        if (i == -1) {
            System.out.println("\u001b{1;31mErro: Pessoa não cadastrada.\u001b[m");
            return;
        }

        cadastro.get(i).setNome(novoNome);
        cadastro.get(i).setIdade(novaIdade);
        cadastro.get(i).setSexo(novoSexo);
    }

    public void listarCadastros() {
        System.out.println("[");
        for (Pessoa pessoa : cadastro) {
            System.out.println(pessoa.toString().indent(4));
        }
        System.out.println("]");
    }
}
