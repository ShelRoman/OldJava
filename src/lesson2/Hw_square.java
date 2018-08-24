package lesson2;

import java.lang.Math;
import java.util.Scanner;

/* ������������ ������ ������������ ����������� ���������.
 ������� �� ����� ����� ���������.
 ���� ������ ����������� ����� ����, �� ������� "������ ����������� �� ����� ���� 0".
 ���� ��������� �� ����� ������, �� ������� "��� �������������� ������� ���������".
 ���� ��������� ����� ��� �������, �� ������� �� � ������ ����� ������ */

public class Hw_square {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int aKof = 0;
		int bKof = 0;
		int cKof = 0;
		System.out.println("������� ����������� �:");
		if (scan.hasNextInt())
			aKof = scan.nextInt();
		else
			System.out.println("�� ����� �� �����");

		System.out.println("������� ����������� b:");
		if (scan.hasNextInt())
			bKof = scan.nextInt();
		else
			System.out.println("�� ����� �� �����");

		System.out.println("������� ����������� c:");
		if (scan.hasNextInt())
			cKof = scan.nextInt();
		else
			System.out.println("�� ����� �� �����");

		if (aKof == 0)
			System.out.println("������ ����������� �� ����� ���� 0");
		else {
			int discr = (bKof * bKof) - 4 * aKof * cKof;
			if (discr < 0)
				System.out.println("��� �������������� ������� ���������");
			if (discr == 0)
				System.out.println(-bKof / (2 * aKof));
			if (discr > 0)
				System.out.print((-bKof + Math.sqrt(discr)) / (2 * aKof) + " "
						+ (-bKof - Math.sqrt(discr)) / (2 * aKof));
		}
	}
}
// done