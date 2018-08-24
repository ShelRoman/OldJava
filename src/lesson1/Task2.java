package lesson1;

import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите целое число:");
		int k = scan.nextInt();
		int res = k * 2;
		System.out.println(res);
	}
}
