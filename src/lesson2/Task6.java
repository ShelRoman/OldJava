package lesson2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your age %username%?:");
		int k1 = scan.nextInt();
		if (k1 < 0)
			System.out.println("�� ����� ������������� �������");
		if (k1 > 0 && k1 <= 9)
			System.out.println("�������� ��������: 0-9");
		if (k1 > 10 && k1 <= 19)
			System.out.println("�������� ��������: 10-19");
		if (k1 > 20 && k1 <= 29)
			System.out.println("�������� ��������: 20-29");
		if (k1 >= 17 && k1 <= 22)
			System.out.println("���: � �����������");
		if (k1 >= 2 && k1 <= 6)
			System.out.println("���: � �����");
		if (k1 >= 7 && k1 <= 16)
			System.out.println("���: � �����");
		if (k1 >= 23)
			System.out.println("���: �� ������");

	}
}
// done