package lesson2;

import java.util.Scanner;

public class Hw_quarter {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner(System.in);
		int axisX = 0;
		int axisY = 0;

		System.out.println("Введите координату x");
		if (scan.hasNextInt())
			axisX = scan.nextInt();
		else
			System.out.println("Вы ввели не число");

		System.out.println("Введите координату y");
		if (scan.hasNextInt())
			axisY = scan.nextInt();
		else
			System.out.println("Вы ввели не число");

		if (axisX == 0 | axisY == 0)
			System.out.println(0);
		if (axisX > 0 && axisY > 0)
			System.out.println(1);
		if (axisX < 0 && axisY > 0)
			System.out.println(2);
		if (axisX < 0 && axisY < 0)
			System.out.println(3);
		if (axisX > 0 && axisY < 0)
			System.out.println(4);
	}
}