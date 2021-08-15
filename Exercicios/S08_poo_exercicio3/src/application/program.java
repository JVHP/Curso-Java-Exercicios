package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		
		System.out.print("Name: ");
		emp1.name = sc.nextLine();
		System.out.print("Salary: ");
		emp1.salary = sc.nextDouble();
		System.out.print("Tax: ");
		emp1.tax = sc.nextDouble();
		System.out.println("Employee: " + emp1.toString());
		System.out.println("");
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		emp1.IncreaseSalary(percentage);
		
		System.out.println("Updated data: " + emp1.toString());
		
		sc.close();

	}

}
