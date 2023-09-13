package exercicios.exE.classes;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private final List<Livro> livrosEscritos = new ArrayList<>();

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }
}
