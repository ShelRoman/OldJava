/*Task6. �������� ��������� ��������� �� �������:
 - �����, ��������� � ������� ������ � ���������� ��
 - �����, ��������� � ������� ������ � ��������� ���
 - �����, ��������� ������ � ������, ������ ����� ������� � ������, ���������� ������ ���������� ��������� ������� � ������
 - ������� �����, ������ ������ �������.
 */
package week1.lesson1;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		String line = createLine();
		char symb = createChar();
		System.out.println(searchCharInLine(line, symb));
	}

	public static String createLine() {
		// initializing new string
		System.out.println("Enter the line");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		return line;
	}

	public static char createChar() {
		// initializing new char
		System.out.println("Enter the char");
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		char symb = line.charAt(0);
		scan.close();
		return symb;
	}

	public static int searchCharInLine(String line, char symb) {
		// searching for last index of char in line
		int searchIndex = 0;
		// starting from the end of string
		for (int i = line.length() - 1; i >= 0; i--) {
			if (line.charAt(i) == symb) {
				searchIndex = i;
				// stops when find
				break;
			}
		}
		return searchIndex;
	}
}
// done

