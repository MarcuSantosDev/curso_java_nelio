package secao13_heranca_polimorfismo.abstração.classes_abstratatas.entities;


public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if(amount <= loanLimit)
            balance += amount;
    }

    @Override
    public void withDraw(double amount){
        super.withDraw(amount);
        balance -= 2; // Mantém o método da classe pai e adiciona -2$ quando sacar
    }
}
