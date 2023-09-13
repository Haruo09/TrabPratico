package exercicios.exE.classes;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private final List<Livro> livros = new ArrayList<>();
    private final List<Autor> autores = new ArrayList<>();
    private final List<Categoria> categorias = new ArrayList<>();

    public void add(Livro livro) {
        if (livros.contains(livro)) {
            System.out.println("\u001b[1;31mErro: Livro já adicionado.\u001b[m");
            return;
        }
        if (!autores.contains(livro.getAutor())) {
            autores.add(livro.getAutor());
        }
        if (!categorias.contains(livro.getCategoria())) {
            categorias.add(livro.getCategoria());
        }
        livros.add(livro);
    }

    public List<Livro> buscarPorAutor(Autor autor) {
        int i = autores.indexOf(autor);
        if (i == -1) {
            System.out.println("\u001b[1;31mErro: Autor não encontrado.\u001b[m");
            return new ArrayList<>();  // retorna lista vazia.
        }
        return autores.get(i).getLivrosEscritos();  // retorna lista de livros escritos.
    }

    public List<Livro> buscarPorCategoria(Categoria categoria) {
        int i = categorias.indexOf(categoria);
        if (i == -1) {
            System.out.println("\u001b[1;31mErro: Categoria não encontrada.\u001b[m");
            return new ArrayList<>();  // retorna lista vazia.
        }
        return categorias.get(i).getCategoria();  // retorna lista de livros da categoria.
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }
}
