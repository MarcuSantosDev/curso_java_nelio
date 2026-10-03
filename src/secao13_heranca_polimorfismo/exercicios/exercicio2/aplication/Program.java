package secao13_heranca_polimorfismo.exercicios.exercicio2.aplication;

import secao13_heranca_polimorfismo.exercicios.exercicio2.entities.ImportedProduct;
import secao13_heranca_polimorfismo.exercicios.exercicio2.entities.Product;
import secao13_heranca_polimorfismo.exercicios.exercicio2.entities.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.println("Enter the number of products");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Product #" + (i+1) + " data:");
            System.out.println("Common, used, imported (c/u/i)");
            char type = sc.next().charAt(0);

            // Products type Common
            if(type=='c') {
                System.out.println("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.println("Price: ");
                double price = sc.nextDouble();

                products.add(new Product(name,price));;
            }

            // Used Products
            if(type == 'u'){
                System.out.println("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.println("Price: ");
                double price = sc.nextDouble();

                System.out.println("Manufacture date (DD/MM/YYYY): ");
                String dateString = sc.next();

                LocalDate manufactureDate = LocalDate.parse(dateString, fmt);

                products.add(new UsedProduct(name, price, manufactureDate));
            }

            // Imported Products
            if(type=='i'){
                System.out.println("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.println("Price: ");
                double price = sc.nextDouble();

                System.out.println("CustomsFee: ");
                double customsFee = sc.nextDouble();

                products.add(new ImportedProduct(name,price,customsFee));
            }
        }

        for (Product product : products){
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
