package week6.lesson11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.File;

public class Task2 {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		File[] carsFile = new File("D:/Java/Cars").listFiles();
		ArrayList<Car> cars = new ArrayList<>();
		for (File car : carsFile) {
			FileInputStream fis = new FileInputStream(car);
			ObjectInputStream oin = new ObjectInputStream(fis);
			cars.add((Car) oin.readObject());
			fis.close();
			oin.close();
			car.delete();
		}

		for (Car car : cars) {
			System.out.println(car.getNumber());
		}
	}

}
