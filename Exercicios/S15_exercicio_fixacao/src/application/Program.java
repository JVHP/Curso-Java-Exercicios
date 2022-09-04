package application;

import model.entities.Account;
import model.exceptions.WithdrawException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("");

            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account ac1 = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();

            ac1.withdraw(amount);
            System.out.println("New balance: " + String.format("$ %.2f", ac1.getBalance()));

        } catch (WithdrawException ex) {
            System.out.println(ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
