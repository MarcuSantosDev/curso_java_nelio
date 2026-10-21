package secao18_programacao_funcional_lambda.interfaces_funcionais.predicate.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import secao18_programacao_funcional_lambda.interfaces_funcionais.predicate.entities.Product;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        // Formas de Implementar o Predicate

        // 1° forma  - Reference method com método estático
        list.removeIf(Product::staticProductPredicate);

        // 2° forma - Reference method sem método estático
        list.removeIf(Product::nonStaticProductPredicate);

        // 3° forma - Expressão lambda declarada
        Predicate<Product> pred = p -> p.getPrice() >= min;
        list.removeIf(pred);

        // 4° forma - Expressão lambda inline
        list.removeIf(p -> p.getPrice() >= min);


        for (Product p : list) {
            System.out.println(p);
        }
    }
}
