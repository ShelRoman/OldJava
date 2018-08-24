/*(while)Написать программу, по выводу чисел на экран: k,k-1,k-2...,2,1
 Где k - считать с консоли.*/
package lesson3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		f();

	}

	public static void f() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		int k = scan.nextInt();

		while (k > 1) {
			System.out.print(k + ", ");
			k--;
		}
		System.out.print(1);
	}

}
// done