package lesson2;

import java.util.Scanner;

/* ������ � ������� ����� ���������� X, ����� ������ ����� ���������� Y.
 �������� ���������. �������� �������� ���������� ������� � ������� �� �� �����. */
public class Task9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("������� ������ �����:");
		if (scan.hasNextInt()) {
			x = scan.nextInt();
		} else {
			System.out.println("�� ����� �� �����");
		}

		System.out.println("������� ������ �����:");
		if (scan.hasNextInt()) {
			y = scan.nextInt();
		} else {
			System.out.println("�� ����� �� �����");
		}

		int x1 = x;
		int y1 = y;
		x = y1;
		y = x1;
		System.out.println(x);
		System.out.println(y);
	}
}
// done