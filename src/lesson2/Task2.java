package lesson2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� 2 �����:");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		if (k1 < k2) {
			System.out.println(k2);
		} else if (k2 < k1) {
			System.out.println(k1);
		} else
			System.out.println("����� �����");
	}
}
// done