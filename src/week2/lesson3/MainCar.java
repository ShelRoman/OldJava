package week2.lesson3;

public class MainCar {

	public static void main(String[] args) {
		Car car = new Car();
		car.setColor("Black");
		@SuppressWarnings("unused")
		Car car1 = new Car();
		System.out.println(car.getColor());
		System.out.println(Car.getCarCount());
	}

}
	