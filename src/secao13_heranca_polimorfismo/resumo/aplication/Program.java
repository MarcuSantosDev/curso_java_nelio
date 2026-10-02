package secao13_heranca_polimorfismo.resumo.aplication;

import secao13_heranca_polimorfismo.resumo.entities.Account;
import secao13_heranca_polimorfismo.resumo.entities.BusinessAccount;
import secao13_heranca_polimorfismo.resumo.entities.SavingsAccount;
import secao13_heranca_polimorfismo.resumo.entities.SavingsAccountPlus;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(1001,"Alex",1000.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",1000.0,500.0);
        SavingsAccountPlus sacc_plus = new SavingsAccountPlus(1003,"Marcus",1000.0,0.0);

        // Upcasting: converter uma referência da classe filha para a classe pai, geralmente para usar polimorfismo.
        Account acc1 = bacc;
        Account acc2 =  new BusinessAccount(1005,"Bob",1000.0,200.0);
        Account acc3 =  new SavingsAccount(1005,"Ana",1000.0,0.01);
        // Essas 3 operações acima são possíveis pq toda BusinessAccount e SavingsAccount também é uma Account

        /*
        Downcasting: converter uma referência da classe pai para a classe filha, permitindo acessar métodos
         específicos da classe filha, usando um cast explícito.
        */

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        /*
        O exemplo abaixo não funciona porque BusinessAccount e SavingsAccount são classes irmãs:
        ambas herdam de Account, mas uma não é filha da outra.
        O erro ocorre somente em tempo de execução (runtime), ao executar o programa.
        */

        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.);
            System.out.println("Empréstimo");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        // Override test
        account.withDraw(200);
        System.out.println("Conta Alex: $" + account.getBalance()); // Account
        acc3.withDraw(200);
        System.out.println("Conta Ana: $" + acc3.getBalance()); // SavingsAccount
        acc2.withDraw(200);
        System.out.println("Conta Bob: $" + acc2.getBalance());; // BusinessAccount
        sacc_plus.withDraw(200);
        System.out.println("Conta Bob: $" + sacc_plus.getBalance());
    }
}
