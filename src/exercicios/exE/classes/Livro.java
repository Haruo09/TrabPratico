package exercicios.exE.classes;

public class Livro {
    private String titulo;
    private Autor autor;
    private Categoria categoria;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;

        // Adicionando o livro à sua categoria e autor pertencentes:
        autor.getLivrosEscritos().add(this);
        categoria.getCategoria().add(this);
    }

    public String toString() {
        return String.format(
            """
            Título: %s
            Autor: %s
            Categoria: %s
            """,
            titulo, autor.getNome(), categoria.getNome()
        );
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
