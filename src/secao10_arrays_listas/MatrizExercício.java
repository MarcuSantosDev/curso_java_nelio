package secao10_arrays_listas;

// Fazer um programa para ler dois números inteiro M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X , mostrar os valores à esquerda, acima ,à direita e abaixo de X, quando houver, conforme exemplo.

import java.util.Locale;
import java.util.Scanner;

public class MatrizExercício {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número M:");
        int m = sc.nextInt();
        System.out.println("Insira um número N:");
        int n = sc.nextInt();

        int [][] mat = new int[m][n];

        // Formando a matriz MxN
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // Exibir a Matriz
        System.out.println("Matriz Criada :");
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Encontrar o valor X na matriz e exibir ocorrências :

        System.out.println("Insira um valor X que tenha na matriz: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (x == mat[i][j]) {
                    // Position
                    System.out.println("Position: " + i + "," + j);
                    // left
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    // Acima
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    // Direita
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    // Abaixo
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }



        sc.close();
    }
}
