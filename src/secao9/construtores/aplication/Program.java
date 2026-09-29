package secao9.construtores.aplication;

import java.util.Locale;
import java.util.Scanner;
import secao9.construtores.entities.Product;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();



        Product product = new Product(name,price);


        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock" + product);
        int quantity_add = sc.nextInt();
        product.addProducts(quantity_add);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock" + product);
        int quantity_remove = sc.nextInt();
        product.removeProducts(quantity_remove);
        System.out.println("Updated data: " + product);






        sc.close();
    }
}
