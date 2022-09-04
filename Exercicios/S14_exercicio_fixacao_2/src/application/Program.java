package application;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Payer> payers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int nPayers = sc.nextInt();

        for (int i  = 1; i <= nPayers; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Comany(i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();

                payers.add(new IndividualPayer(name, anualIncome, healthExpenditures));

            } else if (type == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                payers.add(new CompanyPayer(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        Double sum = 0d;
        for (Payer payer : payers) {
            System.out.println(payer.toString());
            sum += payer.taxes();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: "+String.format("$ %.2f", sum));

        sc.close();
    }
}
