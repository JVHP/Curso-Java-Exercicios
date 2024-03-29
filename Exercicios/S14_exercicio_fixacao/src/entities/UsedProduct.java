package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name + " (used) ");
        sb.append(String.format(" $ %.2f ", price));
        sb.append("(Manufacture date: " + sdf.format(manufactureDate) + ")");

        return sb.toString();
    }
}
