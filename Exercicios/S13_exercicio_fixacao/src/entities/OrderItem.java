package entities;

public class OrderItem {

    private int quantity;
    private double price;

    private Product product;

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(product.toString() + ", ");
        sb.append("Quantity: " + quantity + ", ");
        sb.append("Subtotal: " + String.format("$%.2f", subTotal()));

        return sb.toString();
    }
}
