//Task 2. �������� �����, ������� ��������� ��� ����� � ���������� ���������� ����� � �����. 
package lesson6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException {
		String sFileName = "file2.txt";
		System.out.println(lineQty(sFileName));

	}

	public static int lineQty(String fileName) throws FileNotFoundException {
		FileReader fr = new FileReader(fileName);
		Scanner scan = new Scanner(fr);
		int lineQty = 0; // ���������� ��� �������� �-�� ����� �����
		// c������ �-�� �����
		while (scan.hasNextLine()) {
			lineQty += 1;
			scan.nextLine();
		}
		scan.close();
		return lineQty;
	}
}
// done