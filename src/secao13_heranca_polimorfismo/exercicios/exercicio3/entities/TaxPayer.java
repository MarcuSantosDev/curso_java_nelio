package secao13_heranca_polimorfismo.exercicios.exercicio3.entities;

public abstract class TaxPayer {
    private String name;
    private double annualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, double annualIncome){
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract double tax();
}
