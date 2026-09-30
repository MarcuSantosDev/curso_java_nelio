package secao10_arrays_listas.exercicios_listas.exercicio1.aplication;

import secao10_arrays_listas.exercicios_listas.exercicio1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registred");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.println("ID:");
            int id = sc.nextInt();
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary:");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id,name,salary);
            list.add(emp);
        }
        System.out.println("Enter the employee id that will have salary increase:");
        int idSalary = sc.nextInt();

        Integer pos = position(list,idSalary);
        if (pos == null){
           System.out.println("This id does not exist!");
        }
        else{
           System.out.println("Enter the porcentage ");
           double porcentage = sc.nextDouble();
           list.get(pos).increaseSalary(porcentage);
        }
        sc.close();
    }
    // Encontrar a posição de um funcionário dentro da lista através do ID dele
    public static Integer position(List<Employee> list, int id){
        for(int i=0;i<list.size();i++){
            if (list.get(i).getId() == id) {
                 return i;
             }
        }
        return null;
    }
}
