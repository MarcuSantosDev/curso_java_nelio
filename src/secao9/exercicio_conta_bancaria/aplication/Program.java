package secao9.exercicio_conta_bancaria.aplication;

import java.util.Locale;
import java.util.Scanner;

import secao9.exercicio_conta_bancaria.entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there na initial deposit(y/n): ");
        char response = sc.next().charAt(0);
        if (response=='y'){
            System.out.println("Enter the initial deposit: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber,holder,initialDeposit);
        }
        else{
            account = new Account(accountNumber,holder);
        }
        System.out.println();
        System.out.println("Account data");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data :");
        System.out.println(account);

        System.out.println("Enter a withdraw value");
        double withDrawValue = sc.nextDouble();
        account.withDraw(withDrawValue);

        System.out.println("Updated account data :");
        System.out.println(account);
    }
}
