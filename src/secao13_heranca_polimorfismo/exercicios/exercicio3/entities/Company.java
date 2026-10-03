package secao13_heranca_polimorfismo.exercicios.exercicio3.entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax(){

        double taxAmount;

        if(numberOfEmployees > 10){
            taxAmount = (getAnnualIncome()*0.14);
        }
        else{
            taxAmount = (getAnnualIncome()*0.16);
        }
        return taxAmount;
    }
}
