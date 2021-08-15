package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta1 = null;

		char choice;

		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = sc.next();

		do {
			System.out.print("Is there an initial deposit (y/n)? ");
			choice = sc.next().charAt(0);

		} while ((choice != 'y') && (choice != 'n'));

		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			System.out.println();

			conta1 = new Account(name, account, initialDeposit);

		}

		else if (choice == 'n') {
			conta1 = new Account(name, account);

		}

		System.out.println("Account data: ");
		System.out.println(conta1.toString());

		System.out.println();

		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		conta1.deposit(deposit);

		System.out.println("Updated account data:");
		System.out.println(conta1.toString());

		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		conta1.withdraw(withdraw);

		System.out.println("Updated account data:");
		System.out.println(conta1.toString());

		sc.close();
	}

}
