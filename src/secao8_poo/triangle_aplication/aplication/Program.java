package secao8_poo.triangle_aplication.aplication;

import java.util.Locale;
import java.util.Scanner;
import secao8_poo.triangle_aplication.entities.Triangle;

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

        double areaT1 = t1.area();

        double areaT2 = t2.area();

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
