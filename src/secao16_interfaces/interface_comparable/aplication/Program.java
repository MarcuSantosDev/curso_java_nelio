package secao16_interfaces.interface_comparable.aplication;

import secao16_interfaces.interface_comparable.entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Program {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\test.csv.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCSV;

            while ((employeeCSV = br.readLine()) != null) {
                String[] fields = employeeCSV.split(",");
                list.add(new Employee(fields[0],Double.parseDouble(fields[1])));

            }
            Collections.sort(list);
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        for (Employee employee : list) {
            System.out.println(employee.getName() + " , " + employee.getSalary());
        }
    }
}
