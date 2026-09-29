package secao9.encapsulamento.getters_setters.aplication;

import java.util.Locale;
import java.util.Scanner;
import secao9.encapsulamento.getters_setters.entities.Product;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name,price,quantity);

        // Implementação de getters e setters
        product.setName("computer");
        System.out.println("Updated name: " + product.getName());
        System.out.println();
        product.setPrice(50);
        System.out.println("Updated price: " + product.getPrice());
        System.out.println("Updated quantity: " + product.getQuantity());


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

