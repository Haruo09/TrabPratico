package tests.testone;

public class Main {
    public static void main(String[] args) {
        // Instanciando as pessoas:
        Person a = new Person("a", 16, "123456789-10");
        Person b = new Person("b", 61, "109876543-21");

        // Instanciando o Database:
        DB database = new DB();

        // Adicionando as pessoas no objeto _map_:
        database.map.put(a.getCpf(), a);
        database.map.put(b.getCpf(), b);

        // Adicionando a pessoa "a" no objeto list e imprimindo a sua localização em memória:
        database.list.add(a);
        System.out.println(database.list.get(0));

        // Adicionando a pessoa "b" no objeto list e imprimindo a sua localização em memória:
        database.list.add(b);
        System.out.println(database.list.get(1));

        // Adicionando novamente a pessoa "a", na 3.ª posição, e imprimindo a sua localização em memória:
        database.list.add(a);
        System.out.println(database.list.get(2));

        /*
        * Com isso deduzimos que, apesar do mesmo objeto ser inserido duas vezes na memória,
        * a lista apenas serve como um "referencial", portando o endereço de memória de ambos.
        * Portanto, list.get(0) é igual a list.get(2).
        * */

        // Adicionando novamente a pessoa "b", na 4.° posição, mas usando o "get" do map.
        database.list.add(database.map.get(b.getCpf()));

        // Imprimindo a sua localização em memória:
        System.out.println(database.list.get(3));

        // Modificando um objeto, e imprimindo os endereços de memória da lista:
        database.list.get(0).setName("Aa");
        System.out.println(" ");  // pulando a linha;
        for (Person p : database.list) {
            System.out.println(p);
        }

        // Imprimindo os objetos "a", list[0] e list[2]:
        System.out.printf(
            """
            Objeto: A
            nome: %s
            idade: %d
            cpf: %s
            endereço: %s
            %n""",
            a.getName(),
            a.getAge(),
            a.getCpf(),
            a
        );

        System.out.printf(
            """
            Objeto: list[0]
            nome: %s
            idade: %d
            cpf: %s
            endereço: %s
            %n""",
            database.list.get(0).getName(),
            database.list.get(0).getAge(),
            database.list.get(0).getCpf(),
            database.list.get(0)
        );

        System.out.printf(
            """
            Objeto: list[2]
            nome: %s
            idade: %d
            cpf: %s
            endereço: %s
            %n""",
            database.list.get(2).getName(),
            database.list.get(2).getAge(),
            database.list.get(2).getCpf(),
            database.list.get(2)
        );

        /*
        * Mesmo alterando apenas um objeto, todos os outros foram afetados.
        * Isso só seria possível se todos fossem o mesmo objeto. Ou seja: se
        * todos possuíssem o mesmo referencial de memória, o que se provou novamente
        * verdade.
        *
        * Isso implica que adicionar objetos iguais em bancos de dados diferentes
        * não necessariamente ocupa o dobro de memória, ocupa apenas a memória
        * necessária para armazenar o endereçamento destes objetos.
        * */

        // Tentando obter um valor inexistente:
        Person p = database.map.get("123456789-11");
        System.out.println(p);

        // Conclui-se então que, caso a Hashing Function falhe para a chave, retorno é null.
    }
}
