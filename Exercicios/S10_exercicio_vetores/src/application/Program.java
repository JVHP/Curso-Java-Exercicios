package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos quartos serão alugados? ");
		int qtdRooms = sc.nextInt();
		int c = 0;
		Room[] aluguel = new Room[10];

		for (int i = 0; i < qtdRooms; i++) {
			c++;
			sc.nextLine();
			System.out.println();
			System.out.println("Aluguel #" + c);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();

			while (aluguel[quarto] != null) {
				System.out.print("Quarto já alugado, digite outro: ");
				quarto = sc.nextInt();
			}

			aluguel[quarto] = new Room(nome, email, quarto);

		}

		System.out.println();

		System.out.println("Quartos ocupados:");
		for (int i = 0; i < aluguel.length; i++) {
			if (aluguel[i] != null) {
				System.out.println(aluguel[i].toString());
			}
		}

		sc.close();
	}

}
