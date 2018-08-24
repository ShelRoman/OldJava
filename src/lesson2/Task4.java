package lesson2;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число:");
		int k = scan.nextInt();

		if (k < 0)
			System.out.println("Это отрицательное");

		if ((k >= 0) && (k < 10))
			System.out.println("Это цифра");

		if (k >= 10)
			System.out.println("Это число");
	}
}
// example