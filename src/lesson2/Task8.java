package lesson2;

import java.util.Scanner;

/*������ ����������� ����� �����. �������� ���������. ���������� ������ ����� ����� � ������� �� �����.
 */
public class Task8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����:");
		if (scan.hasNextInt()) {
			int k = scan.nextInt();
			System.out.println((int) k / 10);
		} else {
			System.out.println("�� ����� �� �����");
		}

	}
}

// done
