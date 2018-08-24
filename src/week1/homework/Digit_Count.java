package week1.homework;

import java.util.Scanner;

public class Digit_Count {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String digit = scan.next();
		System.out.println(calcDigitsCount(digit));

	}

	public static int calcDigitsCount(String number) {
		int result = 0;
		int[] dArray = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			dArray[i] = number.charAt(i) - 48;
		}
		for (int j = 0; j < dArray.length; j++) {
			result += dArray[j];
		}
		return result;
	}
}
//done