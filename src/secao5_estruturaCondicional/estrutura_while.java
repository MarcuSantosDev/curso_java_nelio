package secao5_estruturaCondicional;

import java.util.Scanner;

public class estrutura_while {
    public static void main(String[] args){
        int numero;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número");
        numero = scanner.nextInt();
        while (numero != 0) {
            soma += numero;
            System.out.printf("Soma atual: %d%n",soma);
            System.out.println("Insira outro número");
            numero = scanner.nextInt();
        }
        System.out.printf("Soma final: %d",soma);

        scanner.close();
    }
}
