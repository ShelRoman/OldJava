package lesson2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����:");
		int k = scan.nextInt();
		if (k < 0) {
			System.out.println("��� �������������");
		} else if (k < 10) {
			System.out.println("��� �����");
		} else
			System.out.println("��� �����");
	}
}
