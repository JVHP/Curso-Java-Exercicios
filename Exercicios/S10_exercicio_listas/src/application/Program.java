package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos empregados serão registrados? ");
		int qtd = sc.nextInt();
		int counter = 0;
		System.out.println();
		List<Employee> empregados = new ArrayList<>();
		
		for (int i = 0; i < qtd; i++) {
			counter ++;
			System.out.println("Empregado #" + counter);
			System.out.print("Id: ");
			int id = sc.nextInt();sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			
			Employee emp = new Employee(id, nome, salario); 
			empregados.add(emp);
		}
		
		System.out.println();
		
		System.out.print("Entre com o Id do empregado que terá aumento salarial: ");
		int idSelected = sc.nextInt();
		
		Employee selecionado = empregados.stream().filter(x -> x.getId() == idSelected).findFirst().orElse(null);
		
		if (selecionado == null) {
			System.out.println("Esse Id não existe!");
		} else {
			System.out.print("Entre com a porcentagem: ");
			Double porcentagem = sc.nextDouble();
			selecionado.Increase(idSelected, porcentagem);
		}		
		
		System.out.println();
		
		System.out.println("Lista de empregados: ");
		for (Employee empregado : empregados) {
			System.out.println(empregado.toString());
		}
		
		sc.close();
	}

}
