package secao13_heranca_polimorfismo.exercicios.exercicio1.aplication;

import secao13_heranca_polimorfismo.exercicios.exercicio1.entities.Employee;
import secao13_heranca_polimorfismo.exercicios.exercicio1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the numbers of employees");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.println("outsorced(y/n)");
            char is_Outsorced = sc.next().charAt(0);

            System.out.println("Enter the employee name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Employee´s working hours: ");
            Integer hours = sc.nextInt();

            System.out.println("Enter the valur per hour of the employee: ");
            double valorPerHour = sc.nextDouble();

            if(is_Outsorced == 'y'){
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name,hours,valorPerHour,additionalCharge));
            }
            else{
                employees.add(new Employee(name,hours,valorPerHour));
            }
        }

        System.out.println("-------------------------------------");
        for(Employee e:employees){
            System.out.println("- Funcionário(a) " + e.getName() + ": " + String.format("recebeu: $%.2f",e.payment())
            );
        }
        System.out.println("-------------------------------------");

    }
}
