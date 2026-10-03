package secao13_heranca_polimorfismo.exercicios.exercicio2.entities;

public class ImportedProduct extends Product{
    private double customsFee;

    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFee = customsFree;
    }

    public double getCustomsFree() {
        return customsFee;
    }

    public void setCustomsFree(double customsFree) {
        this.customsFee = customsFree;
    }

    @Override
    public String priceTag(){
        return getName() + " $" + String.format("%.2f", (getPrice()+customsFee)) + " (Customsfee: $"
                + String.format("%.2f",customsFee) + ")";
    }

}
