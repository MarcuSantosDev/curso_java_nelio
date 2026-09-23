package secao8_poo_product.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price*quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void remomveProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return String.format("Produto: %s | Preço: %.2f$ | Quantidade: %d | Valor Total Estoque: %.2f$",name,price,quantity,totalValueInStock());
        }
}
