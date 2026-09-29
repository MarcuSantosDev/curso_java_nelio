package secao9.exercicio_conta_bancaria.entities;

public class Account {
    private int accountNumber;
    private String holder;
    private double balance;

    // Construtores
    public Account(int accountNumber, String holder){
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    public Account(int accountNumber, String holder, double initialDeposit){
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    // Métodos
    public void setAccountNumber(String holder){
        this.holder = holder;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public String getHolder(){
        return holder;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        balance -= amount;
    }
    public String toString(){
        return "Account number: "
                + accountNumber
                + ", holder: "
                + holder
                + ", balance: $ "
                + String.format("%.2f", balance);
    }
}
