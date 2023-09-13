package exercicios.exE.main;

import exercicios.exE.classes.Autor;
import exercicios.exE.classes.Categoria;
import exercicios.exE.classes.Livraria;
import exercicios.exE.classes.Livro;

public class Main {
    public static void main(String[] args) {
        // Instanciando autores:
        Autor MachadoDeAssis = new Autor("Machado de Assis");
        Autor MalbaTahan = new Autor("Malba Tahan");
        Autor Arquimedes = new Autor("Arquimedes");

        // Instanciando Categorias:
        Categoria matematica = new Categoria("Matemática");
        Categoria literatura = new Categoria("Literatura");

        // Instanciando livros:
        Livro domCasmurro = new Livro("Dom Casmurro", MachadoDeAssis, literatura);
        Livro memorias = new Livro("Memórias Póstumas de Brás Cubas", MachadoDeAssis, literatura);
        Livro oHomemQueCalculava = new Livro("O Homem Que Calculava", MalbaTahan, matematica);
        Livro stomachion = new Livro("Stomachion", Arquimedes, matematica);

        // Instanciando a livraria:
        Livraria livraria = new Livraria();

        // Adicionando livros à livraria:
        livraria.add(domCasmurro);
        livraria.add(memorias);
        livraria.add(oHomemQueCalculava);
        livraria.add(stomachion);

        // Listando livros:
        System.out.println(livraria.getLivros());  // print feio, mas funcional

        // Buscando por autor:
        System.out.println(livraria.buscarPorAutor(MachadoDeAssis));

        // Buscando por categoria:
        System.out.println(livraria.buscarPorCategoria(matematica));
    }
}
