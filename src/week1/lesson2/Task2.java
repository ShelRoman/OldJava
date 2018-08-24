//Task2. Написать метод принимающий две строки и возвращающий количество вхождений второй строки в первой
package week1.lesson2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the big line");
		String line1 = scan.nextLine();
		System.out.println("Enter the small line");
		String line2 = scan.nextLine();
		System.out.println(lineCount(line1, line2));
	}

	public static int lineCount(String line1, String line2) {
		int lineCount = 0;
		int line2Modifier = 0;
		if (line2.length() > 1) {
			line2Modifier = 1;
		}
		for (int j = 0; j < line1.length(); j++) {
			if (line1.indexOf(line2) > -1) {
				lineCount++;
				line1 = line1.substring(line1.indexOf(line2) + line2.length()
						- line2Modifier);
			}

		}

		return lineCount;
	}

}
// done