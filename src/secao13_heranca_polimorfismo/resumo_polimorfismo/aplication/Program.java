package secao13_heranca_polimorfismo.resumo_polimorfismo.aplication;

import secao13_heranca_polimorfismo.resumo_polimorfismo.entities.Account;
import secao13_heranca_polimorfismo.resumo_polimorfismo.entities.BusinessAccount;
import secao13_heranca_polimorfismo.resumo_polimorfismo.entities.SavingsAccount;


public class Program {
    public static void main(String[] args) {
        Account x = new Account(1020,"Maria",1000.0);
        Account y = new SavingsAccount(1023,"Maria",1000.0,0.01);

        // O compilador não sabe para qual tipo específico a chamada método withDraw está sendo feita  .
        // Quem decide qual implementação executar é a JVM em tempo de execução, olhando para o objeto real

        x.withDraw(50.);
        y.withDraw(50.);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}

