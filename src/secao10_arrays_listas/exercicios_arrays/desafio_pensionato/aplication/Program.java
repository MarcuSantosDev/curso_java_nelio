package secao10_arrays_listas.exercicios_arrays.desafio_pensionato.aplication;

import secao10_arrays_listas.exercicios_arrays.desafio_pensionato.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");

            System.out.println("Name:");
            String name = sc.nextLine();

            System.out.println("Email:");
            String email = sc.nextLine();

            System.out.println("Room:");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            if (vect[roomNumber] != null) {
                System.out.println("This room is already occupied!");
                i--;
            } else {
                vect[roomNumber] = new Rent(name, email, roomNumber);
            }
        }

        System.out.println();
        System.out.println("Busy Rooms:");

        for(int i=0;i<10;i++){
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }


        sc.close();
    }
}
