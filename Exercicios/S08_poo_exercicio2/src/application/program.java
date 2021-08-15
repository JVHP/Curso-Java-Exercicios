package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;


public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student st1 = new Student();
		
		st1.name = sc.nextLine();
		st1.n1 =sc.nextDouble();
		st1.n2 =sc.nextDouble();
		st1.n3 =sc.nextDouble();
		
		System.out.println(st1.toString());
		
		sc.close();

	}

}
