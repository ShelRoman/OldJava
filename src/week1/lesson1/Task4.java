//Task4. Ќаписать метод, принимающий в качестве параметра строку. ¬озвращающий перевернутую строку.
package week1.lesson1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		System.out.println(reverseString(line));
	}

	public static String reverseString(String line) {
		String reverseLine = "";
		for (int i = line.length() - 1; i >= 0; i--) {
			reverseLine += line.charAt(i); 
		}
		
		return reverseLine;
	}
}
//done