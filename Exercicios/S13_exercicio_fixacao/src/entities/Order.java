package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> order_items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public String getFormattedMoment() {
        return sdf.format(moment);
    }

    public void setMoment(Date moment) {
        this.moment = moment;
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

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrder_items() {
        return order_items;
    }

    public void addItem(OrderItem order_item) {
        order_items.add(order_item);
    }

    public void removeItem(OrderItem order_item) {
        order_items.remove(order_item);
    }

    public double total() {
        double total = 0d;

        for (OrderItem order_item : order_items) {
            total += order_item.subTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: " + getFormattedMoment() + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append(client.toString() + "\n");
        sb.append("Order items:\n");

        for (OrderItem item : order_items) {
            sb.append(item.toString() + "\n");
        }

        sb.append("Total price: " + total());

        return sb.toString();
    }
}
