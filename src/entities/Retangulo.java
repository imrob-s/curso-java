package entities;

public class Retangulo {
	
	public double b;
	public double h;

	public double area() {
		return b * h;
	}
	
	public double perimeter() {
		return 2 * (b + h);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));
	}
	
	public String result() {
		return String.format("AREA = %.2f\n", area())
				+ String.format("PERIMETER = %.2f\n", perimeter())
				+ String.format("DIAGONAL = %.2f\n", diagonal());
	}
	
}
