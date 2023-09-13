package exercicios.exA.main;

import exercicios.exA.classes.Agenda;
import exercicios.exA.classes.Contato;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definindo o Locale:
        Locale.setDefault(Locale.US);

        // Instanciando o objeto Scanner:
        Scanner input = new Scanner(System.in);

        // Instanciando o objeto Agenda:
        Agenda agenda = new Agenda();

        // Instanciando contatos:
        System.out.print("Deseja cadastrar quantos contatos? ");
        int qtd = input.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("CONTATO " + (i + 1) + ":");

            System.out.print("ID: ");
            int ID = input.nextInt();

            input.nextLine();  // corrigindo o bug do Scanner;

            // O motivo da criação do Scanner: mostrar que diferenciamos .next() de .nextLine():
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Telefone: ");
            String telefone = input.nextLine();

            // Cadastrando o novo contato na Agenda:
            agenda.adicionarContatos(new Contato(ID, nome, telefone));
            System.out.println(" ");  // quebra de linha, por estética;
        }

        // Listando os contatos cadastrados:
        agenda.listarContatos();

        // Removendo um contato:
        System.out.print("Informe um ID a ser removido: ");
        agenda.removerContatos(input.nextInt());

        // Listando novamente os contatos:
        agenda.listarContatos();

        // Fechando o objeto input:
        input.close();
    }
}
