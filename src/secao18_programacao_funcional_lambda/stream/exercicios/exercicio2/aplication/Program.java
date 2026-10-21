package secao18_programacao_funcional_lambda.stream.exercicios.exercicio2.aplication;

import secao18_programacao_funcional_lambda.stream.exercicios.exercicio2.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String path = "C:\\test.txt\\";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the minimum salary : " );
        double min_salary = sc.nextDouble();

        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> list = new ArrayList<>();

            while((line = br.readLine()) != null){
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);

                list.add(new Employee(name,email,salary));
            }

            System.out.println("Email of people whose salary is more than " + min_salary +  ":");

            List<String> emails =  list.stream()
                    .filter(e -> e.getSalary() > min_salary)
                    .sorted((e1, e2) -> e1.getName().toUpperCase()
                            .compareTo(e2.getName().toUpperCase()))
                    .map(e -> e.getEmail())
                    .collect(Collectors.toList());

            emails.stream().forEach(System.out::println);

            double sum = list.stream()
                    .filter(e -> e.getName().startsWith("M"))
                    .map(e -> e.getSalary())
                    .reduce(0.0,(s1,s2) -> s1 + s2);

            System.out.println("\nSum of the people whose name starts with 'M' : " + sum);

        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
