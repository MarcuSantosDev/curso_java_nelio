package secao8_poo.exercises.exercise_2.aplication;
import java.util.Scanner;
import java.util.Locale;
import secao8_poo.exercises.exercise_2.entities.Employee;

// Fazer um programa para ler os dados do funcionário (nome,salário bruto, imposto). Em seguida mostrar os dados do funcionário (nome e salário líquido). Em seguida aumentar o salário do funcionário com base na porcentagem dada ( somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);
        sc.close();
    }
}
