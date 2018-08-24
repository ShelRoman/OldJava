package lesson2;

import java.util.Scanner;

/*вводится любое число с типом int (от -2 147 483 648 до 2 147 483 647). Провести валидацию. Определить первую цифру числа и вывести на экран.
 */
public class Task8a {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число:");
		if (scan.hasNextInt()) {
			int k = scan.nextInt();
			if (k < 10 && k > -10)
				System.out.println(k);
			else if ((k > 9 && k < 100) | (k < -9 && k > -100))
				System.out.println((int) k / 10);
			else if ((k > 99 && k < 1000) | (k < -99 && k > -1000))
				System.out.println((int) k / 100);
			else if ((k > 999 && k < 9999) | (k < -999 && k > -9999))
				System.out.println((int) k / 1000);
			else if ((k > 9999 && k < 99999) | (k < -9999 && k > -99999))
				System.out.println((int) k / 10000);
			else if ((k > 99999 && k < 999999) | (k < -99999 && k > -999999))
				System.out.println((int) k / 100000);
			else if ((k > 999999 && k < 9999999)
					| (k < -999999 && k > -9999999))
				System.out.println((int) k / 1000000);
			else if ((k > 9999999 && k < 99999999)
					| (k < -9999999 && k > -99999999))
				System.out.println((int) k / 10000000);
			else if ((k > 99999999 && k < 999999999)
					| (k < -99999999 && k > -999999999))
				System.out.println((int) k / 100000000);
			else if ((k > 999999999 && k < 2147483647)
					| (k < -999999999 && k > -2147483648))
				System.out.println((int) k / 1000000000);
		} else {
			System.out.println("Вы ввели не число");
		}

	}
}
// done

