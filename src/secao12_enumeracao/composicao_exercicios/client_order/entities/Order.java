package secao12_enumeracao.composicao_exercicios.client_order.entities;

import secao12_enumeracao.composicao_exercicios.client_order.entities_enum.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    // Constructor
    public Order(LocalDateTime moment, OrderStatus status,Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    // Getters and Setters
    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    // Methods
    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }


    public double total(){
        double sum = 0;

        for (OrderItem item: items){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ").append(moment).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ")
                .append(client.getName())
                .append(" (")
                .append(client.getEmail())
                .append(")\n");

        sb.append("Order items:\n");

        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }

        sb.append("Total price: $").append(String.format("%.2f", total()));

        return sb.toString();
    }

}
