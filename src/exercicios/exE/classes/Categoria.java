package exercicios.exE.classes;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private final List<Livro> categoria = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getCategoria() {
        return categoria;
    }
}
