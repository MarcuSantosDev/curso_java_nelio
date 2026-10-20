package secao17_generics_set_map.generics_delimitados.aplication;

import secao17_generics_set_map.generics_delimitados.services.CalculationService;
import secao17_generics_set_map.generics_delimitados.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        String path = "C:\\max.txt\\";

        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(path))){;
            while((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
            }
            Product x = CalculationService.max(list);
            System.out.println(x);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalStateException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

