package lesson2;

import java.util.Scanner;

/*
 ��������� �����. ������� �� ����� ��������� �����. 
 ���� �� ����� �� �������� ��� �� ����.
 */
public class Task7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����:");
		// int k1 = scan.nextInt();
		scan.hasNextInt();
		if (scan.hasNextInt()) {
			int k = scan.nextInt();
			System.out.println(2 * k);
		} else {
			System.out.println("�� ����� �� �����");
			// k=0;
		}
		// k++;
	}
}
// done