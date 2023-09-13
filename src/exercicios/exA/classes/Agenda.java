package exercicios.exA.classes;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private final Map<Integer, Contato> agendaContatos = new HashMap<>();

    public void adicionarContatos(Contato... contatos) {
        for (Contato contato : contatos) {
            if (agendaContatos.containsKey(contato.getID())) {
                System.out.printf("\u001b[1;31mErro: Contato de ID %d já cadastrado.%n\u001b[m", contato.getID());
            } else {
                agendaContatos.put(contato.getID(), contato);
            }
        }
    }

    public void removerContatos(int... IDs) {
        for (int id : IDs) {
            if (agendaContatos.containsKey(id)) {
                agendaContatos.remove(id);
            } else {
                System.out.printf("\u001b[1;31mContato de ID %d não encontrado.%n\u001b[m", id);
            }
        }
    }

    public void listarContatos() {
        System.out.println("=========== CONTATOS ===========");
        for (Contato contato : agendaContatos.values()) {
            System.out.println(contato.toString());
        }
    }
}
