package secao18_programacao_funcional_lambda.stream.exercicios.exercicio1.entities;

public class Product {
    private String name;
    private String email;
    private double price;

    public Product(String name,String email, double price) {
        this.name = name;
        this.email = email;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Nome: "  + getName() + " email: " + getEmail() + " preço: " + getPrice();
    }
}
