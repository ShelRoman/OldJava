// Task3. Ввести с консоли строку с символами и пробелами. Посчитать количество слов в предлождении.
package week1.lesson1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		System.out.println(wordsCount(line));
	}

	public static int wordsCount(String line) {
		int wordCount = 0;
		if (line.charAt(0) != 0) {
			wordCount++;
		}
		for (int i = 1; i < line.length(); i++) {
			if (line.charAt(i) == ' ' && line.charAt(i + 1) != ' ') {
				wordCount++;
			}
		}

		return wordCount;
	}
}
//done