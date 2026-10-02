package secao13_heranca_polimorfismo.resumo.entities;

public class SavingsAccountPlus extends SavingsAccount{
    public SavingsAccountPlus(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance, interestRate);
    }

    @Override
    public void withDraw(double amount){
        balance -= amount + 5; // Sobrescrevendo a classe já sobreposta adicionando taxa de 5%
    }
}
