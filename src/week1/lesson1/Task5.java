//Task5. Написать метод, принимающий в качестве параметра строку. Возвращающий перевернутую строку, не использующий дополнительной строки.
package week1.lesson1;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		System.out.println(reverseString2(line));
	}

	public static String reverseString2(String line) {
		// adding string to current string in reverse order
		for (int i = line.length() - 1; i >= 0; i--) {
			line += line.charAt(i);
		}
		// cutting string from the middle
		return line.substring(line.length() / 2, line.length());

	}
}
//done