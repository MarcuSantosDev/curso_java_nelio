package secao8_poo.exercises.exercise_3.aplication;
import java.util.Scanner;
import java.util.Locale;
import secao8_poo.exercises.exercise_3.entities.Student;

// Exercício: ler o nome e as três notas de um aluno, calcular a nota final e informar se foi aprovado ou reprovado, mostrando também quantos pontos faltaram para atingir a média.

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.print("Grade 1: ");
        student.grade1 = sc.nextDouble();

        System.out.print("Grade 2: ");
        student.grade2 = sc.nextDouble();

        System.out.print("Grade 3: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
