/*Task 1. �������� �����, ������� ��������� ���� ������� ������� �� k1 �� �2.
 ��� ����� � ��������� ������.
 ���� ����� ��������� ��� ����� , �1 � �2 � �������� ���������.*/
package lesson6;

import java.io.FileWriter;
import java.util.Scanner;

class Task1 {

	public static void main(String[] args) throws Exception {
		String sFileName = "file2.txt";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��������� �����");
		int k1 = scan.nextInt();
		System.out.println("������� �������� �����");
		int k2 = scan.nextInt();
		myMethod(sFileName, k1, k2);
	}

	public static void myMethod(String sFileName, int k1, int k2)
			throws Exception {
		FileWriter fw = new FileWriter(sFileName);
		// ���� ��� ������� �����
		if (k1 % 2 == 0) {
			for (int i = k1; i <= k2; i += 2) {
				fw.write(i + "\n");
			}
			// ���� ��� ��������� �����
		} else {
			for (int i = k1 + 1; i <= k2; i += 2) {
				fw.write(i + "\n");
			}
		}
		fw.close();
	}
}
// done