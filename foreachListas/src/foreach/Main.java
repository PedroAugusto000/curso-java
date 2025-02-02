package foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Cria a lista
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        // Mostra o tamanho da lista
        System.out.println("Tamanho da lista: " + list.size());

        // Imprime todos os elementos da lista
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Remove elementos que começam com 'M'
        list.removeIf(x -> x.charAt(0) == 'M');

        // Imprime a lista após remoção
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Mostra índices de elementos específicos
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("---------------------");

        // Filtra elementos que começam com 'A'
        List<String> result = list.stream()
                                  .filter(x -> x.charAt(0) == 'A')
                                  .collect(Collectors.toList());

        // Imprime o resultado do filtro
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        // Busca o primeiro elemento que começa com 'J' (ou null se não encontrar)
        String name = list.stream()
                          .filter(x -> x.charAt(0) == 'J')
                          .findFirst()
                          .orElse(null);

        System.out.println(name);
    }
}
