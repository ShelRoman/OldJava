package lesson4;

import java.util.Scanner;

public class Task34 {
	public static int getMax(int a1, int b2) {
		if (a1 > b2)
			return a1;
		return b2;
	}

	public static void printMax(int a1, int b1) {
		System.out.println(getMax(a1, b1));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("??????? ?????? ?????:");
		int a = scan.nextInt();
		System.out.println("??????? ?????? ?????:");
		int b = scan.nextInt();
		printMax(a, b);
	}
}
//done