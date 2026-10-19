package secao16_interfaces.interface_comparable.exercicio1.aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String path = "C:\\test.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name;

            while ((name = br.readLine()) != null) {
                list.add(name);
                Collections.sort(list);
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        for (String name : list) {
            System.out.println(name);
        }
    }
}