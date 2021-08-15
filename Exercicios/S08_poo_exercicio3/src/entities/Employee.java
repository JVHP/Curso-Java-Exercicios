package entities;

public class Employee {
	
	public String name;
	public double salary;
	public double tax;
	
	public double NetSalary () {
		return salary - tax;
	}
	
	public void IncreaseSalary (double percentage) {
		salary += salary * (percentage / 100);
	}
	
	public String toString ( ) {
		return name + ", $ " + String.format("%.2f", NetSalary());
	}
	
}
