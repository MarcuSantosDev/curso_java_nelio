package secao10_arrays_listas.exercicios_arrays.exercicio2.aplication;

import secao10_arrays_listas.exercicios_arrays.exercicio2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        sc.nextLine();

        for(int i=0;i< vect.length;i++){
            System.out.println("Enter the name of product #" + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.println("Enter the price of product #" + (i + 1) + ": ");
            double price = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Product(name,price);
        }

        double sum = 0;
        for(int i=0;i<n;i++){
            sum += vect[i].getPrice();
        }
        double avg = sum/n;

        System.out.printf("AVERAGE PRICE = %.2f%n",avg);

        sc.close();
    }
}
