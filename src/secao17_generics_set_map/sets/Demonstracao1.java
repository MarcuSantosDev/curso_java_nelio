package secao17_generics_set_map.sets;

import java.util.HashSet;
import java.util.Set;

public class Demonstracao1 {
    public static void main(String[] args) {
/*
                                                [ SET ]
 - Não admite repetições
 - Elementos não possuem posição
 - Acesso, inserção e remoção de elementos são rápidos
 - Oferece operações eficientes de conjunto: interseção, união, diferença.
  Principais implementações:
 • HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado !
 • TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
 • LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados !

  https://docs.oracle.com/javase/10/docs/api/java/util/Set.html

 */

        Set<String> set = new HashSet<>(); // + rápido , sem ordenação
        // Set<String> set = new TreeSet<>(); => Ordenado em ordem crescente
        // Set<String> set = new LinkedHashSet<>(); => Ordenado na ordem em que foram adicionados

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.remove("Tablet");
        set.removeIf(x-> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }

    }
}
