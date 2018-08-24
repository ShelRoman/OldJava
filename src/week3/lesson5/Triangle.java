package week3.lesson5;

public class Triangle extends Figure {
	private double sideB;
	
	public Triangle(double a, double b) {
		super(a);
		this.setSideB(b);
	}
	
	@Override
	public double getSquare() {
		return (this.getSideA() * this.getSideB()) / 2;
	}
	
	@Override
	public double getPerimetr() {
		return this.getSideA() + this.getSideB() + (Math.sqrt(((this.getSideA() * this.getSideA()) + (this.getSideB() * this.getSideB()))));
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
}
