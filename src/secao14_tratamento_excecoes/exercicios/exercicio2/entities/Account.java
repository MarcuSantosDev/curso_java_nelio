package secao14_tratamento_excecoes.exercicios.exercicio2.entities;

import secao14_tratamento_excecoes.exercicios.exercicio2.exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private double balance;
    private double withDrawLimit;
    public Account() {
    }

    public Account(Integer number, String holder, double balance, double withDrawLimit) {

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }


    public double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
            validateWithDraw(amount);
            balance -= amount;
    }

    private void validateWithDraw(double amount){
        if(amount> getWithDrawLimit()){
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
        }
        if(amount > getBalance()){
            throw new BusinessException("Erro de saque: Saldo insuficiente");
        }
    }
}
