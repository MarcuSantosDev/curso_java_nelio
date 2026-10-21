package secao18_programacao_funcional_lambda.interfaces_funcionais.function.aplication;

import secao18_programacao_funcional_lambda.interfaces_funcionais.function.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //  1° forma - Implementação da interface
//        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        //  2° forma - Reference method com método estático
//        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //  3° forma - Reference method sem método estático
//        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // 4° forma - Expressão lambda declarada
//        Function<Product,String> func = p -> p.getName().toUpperCase();
//        List<String> names = list.stream().map(func).collect(Collectors.toList());
//        names.forEach(System.out::println);

        // 5° forma - Expressão lambda inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        System.out.println(names);
    }
}
