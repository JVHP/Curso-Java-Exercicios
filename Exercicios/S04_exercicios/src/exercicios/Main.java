package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Exercício 1:

//		int a, b, soma;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		soma = a + b;	
//		System.out.println("A soma de " + a + " + " + b + " = " + soma);

		// Exercício 2:

//		double raio, area, pi;
//		pi = 3.14159;
//		
//		raio = sc.nextDouble();
//		
//		area = pi * (Math.pow(raio, 2));
//		
//		System.out.printf("A área de um circulo com raio %.4f é: %.4f", raio, area);

		// Exercício 3:

//		int A, B, C, D, diferenca;
//		
//		A = sc.nextInt();
//		B = sc.nextInt();
//		C = sc.nextInt();
//		D = sc.nextInt();
//		
//		diferenca = ((A * B) - (C * D));
//		
//		System.out.println("Diferença: " + diferenca);

		// Exercício 4:

//		int num, hour;
//		double salary, salaryT;
//		
//		num = sc.nextInt();
//		hour = sc.nextInt();
//		salary = sc.nextDouble();
//		
//		salaryT = salary * hour;
//		System.out.printf("Number: %d%n"
//				+ "Salary: U$ %.2f", num, salaryT);

		// Exercício 5:

//		int cp1, cp2, np1, np2;
//		double vp1, vp2, vt;
//		
//		cp1 = sc.nextInt();
//		np1 = sc.nextInt();
//		vp1 = sc.nextDouble();
//		
//
//		cp2 = sc.nextInt();
//		np2 = sc.nextInt();
//		vp2 = sc.nextDouble();
//		
//		vt = (np1 * vp1) + (np2 * vp2);
//		
//		System.out.printf("Valor a pagar R$ %.2f", vt);

		// Exercício 6:

		double a, b, c, tri, circ, tra, qua, ret, pi;
		pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		tri = (a * c)/2;
		circ = pi * (Math.pow(c, 2));
		tra = (a + b) * c / 2;
		qua = b * b;
		ret = a * b;
		
		System.out.printf("Triângulo: %.3f%n"
				+ "Círculo: %.3f%n"
				+ "Trapézio: %.3f%n"
				+ "Quadrado: %.3f%n"
				+ "Retângulo: %.3f", 
				tri, circ, tra, qua, ret);
		
		sc.close();

	}

}
