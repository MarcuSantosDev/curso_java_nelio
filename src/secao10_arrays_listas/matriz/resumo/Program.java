package secao10_arrays_listas.matriz.resumo;
import java.util.Locale;
import java.util.Scanner;
// Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.



public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho da matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
                 }
            }

        System.out.println("Main diagonal: ");
        for (int i=0;i<n;i++){
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i<mat.length;i++){
            for (int j=0;j<mat[i].length; j++){
                if(mat[i][j] < 0){
                    count ++;
                }
            }
        }
        System.out.println("Negative Numbers: " + count);

        sc.close();
    }
}
