package secao16_interfaces.problemaEstacionamento.resolucao_sem_intercace.aplication;

import secao16_interfaces.problemaEstacionamento.resolucao_sem_intercace.entities.CarRental;
import secao16_interfaces.problemaEstacionamento.resolucao_sem_intercace.entities.Vehicle;
import secao16_interfaces.problemaEstacionamento.resolucao_sem_intercace.services.BrasilTaxService;
import secao16_interfaces.problemaEstacionamento.resolucao_sem_intercace.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data: ");

        System.out.println("Car Model: ");
        String carModel = sc.next();
        sc.nextLine();

        System.out.println("Pickup (dd/MM/YYYY hh:ss) : ");
        LocalDateTime pickupDateTime = LocalDateTime.parse(sc.nextLine(),fmt);

        System.out.println("Return:(dd/MM/YYYY hh:ss) : ");
        LocalDateTime returnMDateTime = LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental cr = new CarRental(pickupDateTime,returnMDateTime,new Vehicle(carModel));

        System.out.println("Enter Price per hour: ");
        double pricePerHour = sc.nextDouble();

        System.out.println("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay,new BrasilTaxService());
        rentalService.processInvoid(cr);

        System.out.println("INVOICE: ");
        System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("Tax: " + cr.getInvoice().getTax());
        System.out.println("Total Payment: " + cr.getInvoice().getTotalPayment());




        sc.close();
    }
}
