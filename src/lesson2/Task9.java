package lesson2;

import java.util.Scanner;

/* Ввести с консоли целую переменную X, затем вторую целую переменную Y.
 Провести валидацию. Поменять значения переменных местами и вывести их на экран. */
public class Task9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("Введите первое число:");
		if (scan.hasNextInt()) {
			x = scan.nextInt();
		} else {
			System.out.println("Вы ввели не число");
		}

		System.out.println("Введите второе число:");
		if (scan.hasNextInt()) {
			y = scan.nextInt();
		} else {
			System.out.println("Вы ввели не число");
		}

		int x1 = x;
		int y1 = y;
		x = y1;
		y = x1;
		System.out.println(x);
		System.out.println(y);
	}
}
// done