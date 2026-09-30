package secao10_arrays_listas.exercicios_listas.resumo_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Marcus");
        list.add("Eduarda");
        list.add("Lula");
        list.add("Bob");
        list.add("Geraldo");
        list.add(2,"Bolsonaro"); // Adiciona no índex específico
        list.add("Larissa");
        list.remove("Marcus"); // Remove um item da lista pelo nome
        list.remove(0); // Remove um item da lista pelo índex

        for(String nome:list) {
            System.out.println(nome);
        }


        System.out.println("Total de nomes na Lista: " + list.size()); // Ver o tamanho da Lista
        System.out.println("-------------------------------------------");

        list.removeIf(x -> x.charAt(0) == 'L'); // Remove o item pelo predicado
        list.indexOf("Bolsonaro");
        for(String nome:list) {
            System.out.println(nome);
        }
        // Encontra o index do elemento na lista, se não achar retorna "-1"
        System.out.println("Index Of Bolsonaro " + list.indexOf("Bolsonaro"));
        System.out.println("-------------------------------------------");
        // Criar lista com elementos filtrados pela letra 'B'
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
        for(String nome:result) {
            System.out.println(nome);
        }

        System.out.println("-------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(name);
    }
}