package secao13_heranca_polimorfismo.exercicios.exercicio1.entities;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }


    @Override
    public double payment(){
        return getHours()*getValuePerHour()*additionalCharge;
    }

}

