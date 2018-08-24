/*Написать метод, определяющий простоту числа.
В main считать число и передать этому методу.*/
package lesson4;

import java.lang.Math;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число:");
		int a = scan.nextInt();
		System.out.println(isPrime(a));
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
//done