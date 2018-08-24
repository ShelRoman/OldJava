/*Task 3. �������� �����, ������� ��������� ��� ����� � ������. 
 * ������ ����� ��������� ������ � ����, ��������, ��� � ���� ����� ��� ���� �����-�� ������.
 */
package lesson6;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) throws IOException {
		String sFileName = "file2.txt";
		String sString = "new line cinema production";
		addLine(sFileName, sString);

	}

	public static void addLine(String fileName, String line) throws IOException {
		// ������� ���������� �����
		FileReader fr = new FileReader(fileName);
		Scanner scan = new Scanner(fr);
		int lineQty = 0;
		while (scan.hasNextLine()) {
			lineQty += 1;
			scan.nextLine();
		}
		scan.close();
		// ���������� ������ � ������
		fr = new FileReader(fileName);
		scan = new Scanner(fr);
		String[] array = new String[lineQty + 1];
		int i = 0;
		while (scan.hasNextLine()) {
			array[i] = scan.nextLine();
			i++;
		}
		scan.close();
		// ���������� ������ �� ��������� � ������
		array[array.length - 1] = line;
		// ���������� ������ � ����
		FileWriter fw = new FileWriter(fileName);
		for (int j = 0; j < array.length; j++) {
			fw.write(array[j] + "\n");
		}
		fw.close();
	}
}