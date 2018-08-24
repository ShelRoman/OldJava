package week2.lesson3;

import org.jetbrains.annotations.Contract;

public class Car {
	private String color;
	private String model;
	private String number;
	static String name;
	static int carCount;
	
	public void setColor(String color) {
		if (color.equals("Black")) {
			this.color = color;
		}
		if (color.equals("Red")) {
			this.color = color;
		}
		if (color.equals("White")) {
			this.color = color;
		}

	}

	public String getColor() {
		return color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public Car() {
		this("AA 1111 AA");
	}

	public Car(String number) {
		this(number, "Black");
	}

	public Car(String number, String color) {
		this.number = number;
		setColor(color);
		carCount++;
				
	}
	
	@Contract(pure = true)
	public static int getCarCount() {
		return carCount;
	}
}
