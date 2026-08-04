package secao5;

import java.util.Scanner;

public class condicional_composta {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas");
        hora = scanner.nextInt();

        if ( hora < 18) {
            System.out.println("Bom dia");
        }
        else {
            System.out.println("Boa Noite");
        }
        scanner.close();
    }
}
