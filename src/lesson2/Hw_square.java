package lesson2;

import java.lang.Math;
import java.util.Scanner;

/* Пользователь вводит коэффициенты квадратного уравнения.
 Вывести на экран корни уравнения.
 Если первый коэффициент равен нулю, то вывести "Первый коэффициент не может быть 0".
 Если уравнение не имеет корней, то вывести "Нет действительных решений уравнения".
 Если уравнение имеет два решения, то вывести их в строку через пробел */

public class Hw_square {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int aKof = 0;
		int bKof = 0;
		int cKof = 0;
		System.out.println("Введите коэффициент а:");
		if (scan.hasNextInt())
			aKof = scan.nextInt();
		else
			System.out.println("Вы ввели не число");

		System.out.println("Введите коэффициент b:");
		if (scan.hasNextInt())
			bKof = scan.nextInt();
		else
			System.out.println("Вы ввели не число");

		System.out.println("Введите коэффициент c:");
		if (scan.hasNextInt())
			cKof = scan.nextInt();
		else
			System.out.println("Вы ввели не число");

		if (aKof == 0)
			System.out.println("Первый коэффициент не может быть 0");
		else {
			int discr = (bKof * bKof) - 4 * aKof * cKof;
			if (discr < 0)
				System.out.println("Нет действительных решений уравнения");
			if (discr == 0)
				System.out.println(-bKof / (2 * aKof));
			if (discr > 0)
				System.out.print((-bKof + Math.sqrt(discr)) / (2 * aKof) + " "
						+ (-bKof - Math.sqrt(discr)) / (2 * aKof));
		}
	}
}
// done