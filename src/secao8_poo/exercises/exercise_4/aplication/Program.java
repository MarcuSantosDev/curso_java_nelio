package secao8_poo.exercises.exercise_4.aplication;

import java.util.Scanner;
import java.util.Locale;
import secao8_poo.exercises.exercise_4.util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollar = sc.nextDouble();

        double reais = CurrencyConverter.dollarToReal(dollar, dollarPrice);
        double iof = CurrencyConverter.iof(dollar, dollarPrice);


        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.total(dollar,dollarPrice));

        sc.close();
    }
}

