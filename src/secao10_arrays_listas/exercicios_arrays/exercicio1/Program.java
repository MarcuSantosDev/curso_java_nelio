// Exercício: Ler a quantidade de alturas, armazená-las em um vetor,
// calcular a soma dos valores e exibir a altura média.

package secao10_arrays_listas.exercicios_arrays.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of heights: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height " + (i + 1) + ": ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.println();
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }
}