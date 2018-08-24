package lesson4;

import java.util.Scanner;

public class Task1 {

	public static void printSumma(int a1, int b1) {
		int res = a1 + b1;
		b1 = 50;
		System.out.println(res);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите первое число:");
		int a = scan.nextInt(); // 10
		System.out.println("¬ведите второе число:");
		int b = scan.nextInt(); // 20
		printSumma(a, b); // printSumma(10, 20);
		System.out.println(6 % 4);
	}
}
// done