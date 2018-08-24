package lesson2;

import java.util.Scanner;

/*Ввести двухзначное целое число. Провести валидацию. Определить первую цифру числа и вывести на экран.
 */
public class Task8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число:");
		if (scan.hasNextInt()) {
			int k = scan.nextInt();
			System.out.println((int) k / 10);
		} else {
			System.out.println("Вы ввели не число");
		}

	}
}

// done
