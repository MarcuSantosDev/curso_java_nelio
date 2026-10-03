package secao13_heranca_polimorfismo.exercicios.exercicio3.aplication;

import secao13_heranca_polimorfismo.exercicios.exercicio3.entities.Company;
import secao13_heranca_polimorfismo.exercicios.exercicio3.entities.Individual;
import secao13_heranca_polimorfismo.exercicios.exercicio3.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.println("Individual or company (i/c)");
            char type = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Annual Income: ");
            double annualIncome = sc.nextDouble();

            if(type == 'i'){
                System.out.println("Healh expenditures: ");
                double healhExpenditures = sc.nextDouble();

                list.add(new Individual(name,annualIncome,healhExpenditures));
            }
            if(type == 'c'){
                System.out.println("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name,annualIncome,numberOfEmployees));
            }
        }

            double total_taxes = 0.0;

            for(TaxPayer taxPayer:list){
                System.out.println("TAXES PAID: ");
                System.out.println(taxPayer.getName() + ": " + "$" + String.format("%.2f",taxPayer.tax()));

                 total_taxes += taxPayer.tax();
            }

        System.out.printf("Total Taxes: $%.2f%n",total_taxes);
        sc.close();
    }
}
