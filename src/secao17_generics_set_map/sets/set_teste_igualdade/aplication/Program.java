package secao17_generics_set_map.sets.set_teste_igualdade.aplication;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import secao17_generics_set_map.sets.set_teste_igualdade.entities.Product;

/*
 * Como as coleções baseadas em hash verificam a igualdade?
 *
 * • Se hashCode() e equals() estiverem sobrescritos:
 *   1. Primeiro, hashCode() é utilizado para determinar o bucket.
 *   2. Se houver colisão, equals() é utilizado para verificar
 *      se os objetos são iguais.
 *
 * • Se hashCode() e equals() não estiverem sobrescritos:
 *   1. Compara as referências (ponteiros) dos objetos.
 *
 */

public class Program {
    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));
        for (Product p : set) {
            System.out.println(p);
        }

        Product prod = new Product("Notebook",1200.0);

        System.out.println(set.contains(prod));
    }
}