package secao8_poo.aplication;

import java.util.Locale;
import java.util.Scanner;
import secao8_poo.entities.Triangle;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle t1,t2;
        t1 = new Triangle();
        t2 = new Triangle();

        System.out.println("Enter the measures of triangle t1 :");
        t1.a = sc.nextDouble();
        t1.b = sc.nextDouble();
        t1.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle t2 :");
        t2.a = sc.nextDouble();
        t2.b = sc.nextDouble();
        t2.c = sc.nextDouble();

        double p = (t1.a + t1.b + t1.c) / 2.0;
        double areaT1 = Math.sqrt(p * (p - t1.a) * (p - t1.b) * (p - t1.c));

        p = (t2.a + t2.b + t2.c) / 2.0;
        double areaT2 = Math.sqrt(p * (p - t2.a) * (p - t2.b) * (p - t2.c));

        System.out.println("Triangle T1 area : " + areaT1);
        System.out.println("Triangle T2 area : " + areaT2);

        if (areaT1 > areaT2) {
            System.out.println("O Triângulo t1 tem a maior área ");
        }
        else {
            System.out.println("O Triângulo t2 tem a maior área ");
        }
    }
}
