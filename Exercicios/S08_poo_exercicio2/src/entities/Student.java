package entities;

public class Student {

	public String name;
	public double n1, n2, n3;

	public Double notaFinal() {
		if (n1 > 30) {
			n1 = 30;
		}
		if (n2 > 35) {
			n2 = 35;
		}
		if (n3 > 35) {
			n3 = 35;
		}
		return n1 + n2 + n3;
	}

	public String toString() {

		if (notaFinal() < 80) {
			return "Final grade = " + notaFinal() + "\nFAILED\nMissing " + (60 - notaFinal()) + " Points.";

		} else {
			return "Final grade = " + notaFinal() + "\nPASS.";

		}

	}

}
