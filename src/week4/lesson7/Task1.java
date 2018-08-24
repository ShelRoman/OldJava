//Task1. ��������� � ������� ���� ����� � ����������. ������� �� ����� ��� ����� � ���������� �� ���� �����.

package week4.lesson7;

import java.io.File;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Input name of directory,please:");
		String dir = scan.nextLine();
		System.out.print("Input extention:");
		String ext = scan.nextLine();

		File[] files = new File(dir).listFiles();
		for (File file : files) {
			if (file.getName().toLowerCase().endsWith("" + ext))
				System.out.println(file.getName());
		}

	}

}
