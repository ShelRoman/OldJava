package lesson2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����:");
		int k1 = scan.nextInt();
		if ((double) k1 / 2 != (int) (k1 / 2)) {
			System.out.println("��������");
		} else
			System.out.println("������");
	}
}
// done