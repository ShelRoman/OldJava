package lesson2;

import java.util.Scanner;

public class Hw_year {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner(System.in);
		int year = 0;

		System.out.println("������� ���");
		if (scan.hasNextInt())
			year = scan.nextInt();
		else
			System.out.println("�� ����� �� �����");

		if (year % 400 == 0)
			System.out.println("����������");
		else if (year % 4 == 0 && year % 100 != 0)
			System.out.println("����������");
		else
			System.out.println("������������");
	}
}