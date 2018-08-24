package week3.lesson5;

public class Square extends Figure {
	private double sideB;
	
	public Square(double a) {
		super(a);
		this.setSideB(a);
	}
	
	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	@Override
	public double getSquare() {
		return this.getSideA() * this.getSideB();
	}
	
	@Override
	public double getPerimetr() {
		return (this.getSideA() + this.getSideB()) * 2;
	}
}
