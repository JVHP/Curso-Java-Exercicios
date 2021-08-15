package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle X = new Rectangle();
		
		X.b = sc.nextDouble();
		X.h = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", X.area());
		System.out.printf("Perimeter: %.2f%n", X.perimeter());
		System.out.printf("Diagonal: %.2f", X.diagonal());
		
		sc.close();

	}

}
