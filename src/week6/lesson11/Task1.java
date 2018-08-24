/* Task 2. Создать/использовать класс Авто. С консоли считать целое k.
Создать k объектов Авто(со случайными значениями), записать каждый объект в отдельный файл(в байтовый поток),
при этом имя файла соответсвует его номеру.

Task 3. Написать программу, которая сканирует папку(из предыдущего пример) на поиск файлов с расширением ".out", 
где в каждом файле лежит объект Авто. Десериализовать объекты из файлов в объекты и поместить их в список Авто.
Вывести на экран список Авто.*/
package week6.lesson11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of cars to create");
		int k = scan.nextInt();
		ArrayList<Car> cars = new ArrayList<>();
		while (k != 0) {
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter car number");
			String tNum = scan2.nextLine();
			System.out.println("Enter car color");
			String tColor = scan2.nextLine();
			cars.add(new Car(tNum, tColor));
			k--;
		}
		for (Car car : cars) {
			FileOutputStream fos = new FileOutputStream("D:/Java/Cars/" + car.getNumber() + ".car");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(car);
			oos.close();
			fos.close();
		}

	}

}
