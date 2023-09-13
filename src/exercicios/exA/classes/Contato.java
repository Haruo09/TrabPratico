package exercicios.exA.classes;

public class Contato {
    private final int ID;
    private String nome;
    private String telefone;

    public Contato(int ID, String nome, String telefone) {
        this.ID = ID;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String toString() {
        return String.format(
            """
            ID: %d
            Nome: %s
            Telefone: %s
            """, ID, nome, telefone
        );
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
