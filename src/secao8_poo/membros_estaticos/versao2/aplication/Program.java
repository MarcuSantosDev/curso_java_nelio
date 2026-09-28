package secao8_poo.membros_estaticos.versao2.aplication;

import secao8_poo.membros_estaticos.versao2.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);


        System.out.printf("Circumference: %.2f ",c);
        System.out.printf("Volume: %.2f ",v);
        System.out.printf("PI VALUE: %.2f ",calc.PI);
        sc.close();
    }
}
