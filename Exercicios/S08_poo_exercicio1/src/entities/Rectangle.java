package entities;

public class Rectangle {

	public double b, h;
	
	public double area () {
		return b * h;
	}
	
	public double perimeter () {
		return b * 2 + h * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));
	}
	
}
