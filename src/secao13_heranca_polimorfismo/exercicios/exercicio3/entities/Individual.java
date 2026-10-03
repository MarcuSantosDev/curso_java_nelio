package secao13_heranca_polimorfismo.exercicios.exercicio3.entities;

public class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double taxAmount;

        if (getAnnualIncome() < 20000) {
            taxAmount = getAnnualIncome() * 0.15;   // Se salário menor que 20.000, imposto de 15%
        } else {
            taxAmount = getAnnualIncome() * 0.25;   // Se salário maior que 20.000, imposto de 25%
        }

        if(healthExpenditures > 0) { // Se teve gasto com saúde, abater 50% do valor gasto com saúde
            taxAmount -= (healthExpenditures * 0.5);
        }
        return taxAmount;
    }
}
