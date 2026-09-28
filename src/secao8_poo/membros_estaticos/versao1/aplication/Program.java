package secao8_poo.membros_estaticos.versao1.aplication;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f ",c);
        System.out.printf("Volume: %.2f ",v);
        System.out.printf("PI VALUE: %.2f ",PI);
        sc.close();
    }

    public static double circumference(double radius){
        return 2* PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
