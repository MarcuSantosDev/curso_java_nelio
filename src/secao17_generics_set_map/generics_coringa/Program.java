package secao17_generics_set_map.generics_coringa;

import java.util.ArrayList;
import java.util.List;

public class Program {
    // Não é possível adicionar dados a uma coleção de tipo coringa
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        List<String> nomes = new ArrayList<>();
        nomes.add("Marcus");
        nomes.add("João");
        nomes.add("Maria");

        List<Double> precos = new ArrayList<>();
        precos.add(15.50);
        precos.add(29.90);
        precos.add(40.00);

        System.out.println("Números:");
        imprimirLista(numeros);

        System.out.println("\nNomes:");
        imprimirLista(nomes);

        System.out.println("\nPreços:");
        imprimirLista(precos);
    }

    public static void imprimirLista(List<?> lista) { // <?> aceita listas de diferentes tipos
        for (Object item : lista) {
            System.out.println(item);
        }
    }
}