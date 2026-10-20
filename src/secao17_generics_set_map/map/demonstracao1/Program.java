package secao17_generics_set_map.map.demonstracao1;

/*
                                                [ MAP ]
 - Armazena elementos no formato chave-valor (key-value).
 - As chaves não podem se repetir; cada chave está associada a um valor.
 - Valores podem se repetir.
 - Não possui posições numéricas como uma List.
 - Permite buscar, inserir, atualizar e remover elementos pela chave.
 - Principais métodos: put(), get(), containsKey(), remove(), keySet(), values() e entrySet().

  Principais implementações:
 • HashMap - geralmente mais rápido (operações O(1) em média) e não garante ordem dos elementos.
 • TreeMap - operações O(log(n)) em árvore rubro-negra e mantém as chaves ordenadas pelo compareTo (ou Comparator).
 • LinkedHashMap - geralmente O(1) em operações básicas e mantém a ordem de inserção das chaves (por padrão).

  https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html

 */

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username","maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone","99784514353");
        cookies.remove("email");
        cookies.put("phone","81 991883051"); // Sobrescreveu a chave phone pq n permite repetição

        System.out.println("Contains 'phone' key : " + cookies.containsKey("phone") );
        System.out.println("Phone Number: " + cookies.get("phone")); // Pega o valor da chave
        System.out.println("Email : " + cookies.get("email")); // Se não existe retorna null
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies: ");

        // Exibir chave,valor usando EntrySet

        for (Map.Entry<String,String> entry :cookies.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
