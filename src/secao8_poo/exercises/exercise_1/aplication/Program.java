package secao8_poo.exercises.exercise_1.aplication;

import secao8_poo.exercises.exercise_1.entities.Rectangle;

import java.util.Scanner;
import java.util.Locale;

// Fazer um programa para ler os valores da largura e altura de um Retângulo. Em seguida, Mostrar na tela o valor de sua área, perímetro e diagonal. Usar classes como mostrado no projeto.

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Insira a largura no retângulo: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Insira a altura no retângulo: ");
        rectangle.height = sc.nextDouble();

        System.out.println(String.format("A área do retângulo é de %.2f", rectangle.calculate_Area()));
        System.out.println(String.format("O perímetro do retângulo é de %.2f", rectangle.calculate_Perimeter()));
        System.out.println(String.format("A diagonal do retângulo é de %.5f", rectangle.calculate_Diagonal()));




        sc.close();
    }
}
