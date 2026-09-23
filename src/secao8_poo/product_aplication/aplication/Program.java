package secao8_poo.product_aplication.aplication;

import java.util.Locale;
import java.util.Scanner;
import secao8_poo_product.entities.Product;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

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
        product.remomveProducts(quantity_remove);
        System.out.println("Updated data: " + product);






        sc.close();
    }
}
