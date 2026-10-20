package secao16_interfaces.default_methods.aplication;

import secao16_interfaces.default_methods.services.BrazilInterestService;
import secao16_interfaces.default_methods.services.InterestService;
import secao16_interfaces.default_methods.services.UsaInterestService;

import java.util.Scanner;

public class Program {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Amount: ");
         double amount = sc.nextDouble();
         System.out.println("Months: ");
         int months = sc.nextInt();

         InterestService br = new BrazilInterestService(2.0);
         double payment_br = br.payment(amount,months);
         InterestService us = new UsaInterestService(1.0);
         double payment_us = us.payment(amount,months);



         System.out.println("Brazilian Payment after " + months + " months: ");
         System.out.println(String.format("%.2f",payment_br));
         System.out.println("US Payment after " + months + " months: ");
         System.out.println(String.format("%.2f",payment_us));

         sc.close();
     }
}
