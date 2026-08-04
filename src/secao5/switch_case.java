package secao5;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int entrada;
        String dia;

        System.out.println("Insira o número do dia da semana:");
        entrada = scanner.nextInt();

        switch (entrada) {
            case 1:
                dia = "segunda-feira";
                break;
            case 2:
                dia = "terça-feira";
                break;
            case 3:
                dia = "quarta-feira";
                break;
            case 4:
                dia = "quinta-feira";
                break;
            case 5:
                dia = "sexta-feira";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                dia = "Número inserido inválido";
        }

        System.out.printf("O dia da semana selecionado foi %s%n", dia);

        scanner.close();
    }
}