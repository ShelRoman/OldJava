/* Task3. ���� ������ � ������ �������� 3.
�������� �����, ������� ��������� ��� ����� � ������� ���������� ����� ������ ������.
����������� ���������� (������ ������ ��������� �� ������� �������� �� 3 �������� ������ � � D)
 � ������������ (������ ������ ��������� �� ������� �������� �� 3 �������� ����� E � B)
 ��������: abe15 -> cdh48
 ���������� ���� �������� ��������� �����. �������� � �������� �� ��������� ������ �� ���������. */

package week1.lesson2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) throws IOException {
		//codeCaesar("CaesarPlate.txt");
		deCodeCaesar("CaesarPlate.txt");
	}

	public static void codeCaesar(String fileName) throws IOException {
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

		// code it
		for (int i = 0; i < charList.length; i++) {
			for (int j = 0; j < charList[i].length; j++) {
				if (charList[i][j] != ' ') {
					charList[i][j] += 3;
				}
			}
		}
		// writing array to file
		FileWriter fw = new FileWriter(fileName);
		for (int i = 0; i < charList.length; i++) {
			for (int j = 0; j < charList[i].length; j++) {
				fw.write(charList[i][j]);
			}
			fw.write("\n");
		}
		fw.close();
	}

	public static void deCodeCaesar(String fileName) throws IOException {
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

		// decode it
		for (int i = 0; i < charList.length; i++) {
			for (int j = 0; j < charList[i].length; j++) {
				if (charList[i][j] != ' ') {
					charList[i][j] -= 3;
				}
			}
		}
		// writing array to file
		FileWriter fw = new FileWriter(fileName);
		for (int i = 0; i < charList.length; i++) {
			for (int j = 0; j < charList[i].length; j++) {
				fw.write(charList[i][j]);
			}
			fw.write("\n");
		}
		fw.close();
	}
}
//done