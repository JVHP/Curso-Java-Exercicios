package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int nr_prdcts = sc.nextInt();

        for (int i = 1; i <= nr_prdcts; i++) {

            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported(c/u/i)? ");
            char prdct_type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (prdct_type == 'c') {
                products.add(new Product(name, price));

            } else if (prdct_type == 'u') {
                System.out.print("Manufacture date(DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, manufactureDate));

            } else if (prdct_type == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));

            }

        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for (Product prdct : products) {
            System.out.println(prdct.priceTag());
        }

        sc.close();
    }
}
