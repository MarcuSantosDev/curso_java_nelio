package secao4_estruturaSequencial;

import java.util.Scanner;

public class funcoes_matematicas {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        int soma;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        soma = n1+n2;
        System.out.printf("A soma de %d + %d é igual a %d%n",n1,n2,soma);
        System.out.printf("oi");

        scanner.close();
    }
}
