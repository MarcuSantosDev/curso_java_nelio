package secao18_programacao_funcional_lambda.interfaces_funcionais.consumer.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import secao18_programacao_funcional_lambda.interfaces_funcionais.consumer.entities.Product;
import secao18_programacao_funcional_lambda.interfaces_funcionais.consumer.util.PriceUpdate;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;

        // 1° forma  - Implementação da Interface
        list.forEach(new PriceUpdate());

        // 2° forma  - Reference method com método estático
        list.forEach(Product::nonStaticPriceUpdate);

        // 3° forma  - Reference method sem método estático
        list.forEach(Product::staticPriceUpdate);

        // 4° forma - Expressão lambda declarada
        Consumer<Product> cons = p ->  {
            p.setPrice(p.getPrice() * factor);
        };
        list.forEach(cons);

        // 5° forma - Expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * factor));


        list.forEach(System.out::println);
    }
}
