package secao14_tratamento_excecoes.exercicios.exercicio2.aplication;

import secao14_tratamento_excecoes.exercicios.exercicio2.entities.Account;
import secao14_tratamento_excecoes.exercicios.exercicio2.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account data: ");
        System.out.println("Number: ");
        Integer number = sc.nextInt();
        System.out.println("Holder ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Balance: ");
        double balance = sc.nextDouble();
        System.out.println("Withdraw Limit: ");
        double withDrawLimit = sc.nextDouble();

        Account acc = new Account(number,holder, balance, withDrawLimit);

        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            acc.withDraw(amount);

            System.out.println("|Account Data| " +
                    "number: "
                    + acc.getNumber()
                    + " Holder : " + acc.getHolder()
                    + " Balance: "
                    + String.format("%.2f", acc.getBalance()));
        }

        catch (BusinessException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
