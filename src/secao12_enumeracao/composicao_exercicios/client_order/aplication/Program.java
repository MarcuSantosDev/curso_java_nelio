package secao12_enumeracao.composicao_exercicios.client_order.aplication;

import secao12_enumeracao.composicao_exercicios.client_order.entities.Client;
import secao12_enumeracao.composicao_exercicios.client_order.entities.OrderItem;
import secao12_enumeracao.composicao_exercicios.client_order.entities.Product;
import secao12_enumeracao.composicao_exercicios.client_order.entities.Order;
import secao12_enumeracao.composicao_exercicios.client_order.entities_enum.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), fmt);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(LocalDateTime.now(),status,client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= N; i++) {
            System.out.println("Enter #" + i + " item data:");

            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}