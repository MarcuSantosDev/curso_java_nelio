package secao9.encapsulamento.getters_setters.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    //Construtor para tornar obrigatório nome e preço de produto
    public Product(String name, double price, int quantity) {
        this.name =  name;
        this.price = price;
        this.quantity = quantity;
    }

    // Sobrecarga Permite criar um Product sem passar quantity como argumento
    public Product(String name, double price) {
        this.name =  name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return String.format(
                "Produto: %s | Preço: %.2f$ | Quantidade: %d | Valor Total Estoque: %.2f$",
                name, price, quantity, totalValueInStock()
        );
    }
}

