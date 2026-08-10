package secao5_estruturaCondicional;

import java.util.Scanner;

public class estrutura_for {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número para decrescer até 0");
        n = scanner.nextInt();

        for (int i=n; i>=0 ; i-=1){
            System.out.println(i);
        }
        System.out.println("Fim");
        scanner.close();
    }
}
