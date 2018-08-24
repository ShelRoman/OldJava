/* Task4.
1) �������� �����, ������� � �������� ��������� ��������� ��� �����.
����� ���������� ���������� ������ (String): ����� ���������� � ��������.

� ����� ����� ���������� ������� ���:
;v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe]; 
���������� ������� �������������� ������ � �����:
 - ��� ���������� ������ ����� ����� �������� ';' � '='
 - �������� ���������� ������ ���� ����� ����� '=' � ��������� � ���������� �������
 - ��� ��� ���� ����� ���������� ������� �� ';' �������� ���������� ��������� � � ������ ������ ��� ������������

2) � �����:
- ������� ������, 
- ������� � ������� ��� �����, 
- �������� ��� � ����� 1
- ���������� ������ �������� � ����� 2 (����� �� �����) */
package week1.lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) throws FileNotFoundException {
		String[][] vector = createVector("System.txt");
		printVector(vector);
	}

	public static void printVector(String vector[][]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i][0] + " = " + vector[i][1]);
		}
	}

	public static String[][] createVector(String fileName)
			throws FileNotFoundException {
		int arrayLength = 0;
		// creating arraylist with file's text
		FileReader fr = new FileReader(fileName);
		Scanner scan = new Scanner(fr);
		ArrayList<String> list = new ArrayList<String>();
		while (scan.hasNextLine()) {
			list.add(scan.nextLine());
		}
		scan.close();
		// copy text to array of chars
		char[][] charList = new char[list.size()][];
		for (int i = 0; i < list.size(); i++) {
			charList[i] = list.get(i).toCharArray();
		}
		// getting size of new vector
		for (int i = 0; i < charList.length; i++) {
			for (int j = 0; j < charList[i].length; j++) {
				if (charList[i][j] == '[') {
					arrayLength++;
				}
			}
		}
		// creating array for return
		String[][] array = new String[arrayLength][2];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = "";
			}
		}
		int t = 0;
		int y = 0;
		// filling values
		for (int i = 0; i < charList.length; i++) {
			for (int j = 0; j < charList[i].length; j++) {
				if (charList[i][j] == ';') {
					j++;
					while (charList[i][j] != '=') {
						array[t][0] += charList[i][j];
						j++;
					}
					t++;
				}
				if (charList[i][j] == '[') {
					j++;
					while (charList[i][j] != ']') {
						array[y][1] += charList[i][j];
						j++;
					}
					y++;
				}

			}

		}
		return array;
	}
}
