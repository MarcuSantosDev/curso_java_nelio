package secao5_estruturaCondicional;

import java.util.Scanner;

public class estrutura_do_while {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();
        } while (numero != 0);

        System.out.println("Programa encerrado!");

        sc.close();
    }
}
