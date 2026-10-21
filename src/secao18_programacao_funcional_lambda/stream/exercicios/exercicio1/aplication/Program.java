package secao18_programacao_funcional_lambda.stream.exercicios.exercicio1.aplication;

import secao18_programacao_funcional_lambda.stream.exercicios.exercicio1.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\test.txt\\";
        List<Product> list = new ArrayList<>();

        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (((line = br.readLine()) != null)){
            String[] fields = line.split(",");
            String name = fields[0];
            String email = fields[1];
            double price = Double.parseDouble(fields[2]);
            list.add(new Product(name,email,price));
            }

            double avg = list.stream().map(p -> p.getPrice()).reduce(0.0,(x,y) -> x+y)/list.size();
            System.out.println("Average Price: " + avg);

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.stream().forEach(System.out::println);
        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
