package lesson2;

import java.util.Scanner;

public class Hw_average7 {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner(System.in);
		System.out.println("??????? ??????????? ?????");
		int average7 = 0;
		if (scan.hasNextInt()) {
			average7 = scan.nextInt();
			if (((average7 > 9999999 && average7 > 0) | (average7 < 1000000 && average7 > 0))
					| ((average7 < -9999999 && average7 < 0) | (average7 > -1000000 && average7 < 0)))
				System.out.println("?? ????? ?? ??????????? ?????");
		} else
			System.out.println("?? ????? ?? ?????");

		int first = average7 / 1000000;
		int second = average7 / 100000 - ((average7 / 1000000) * 10);
		int third = average7 / 10000 - ((average7 / 100000) * 10);
		int fourth = average7 / 1000 - ((average7 / 10000) * 10);
		int fifth = average7 / 100 - ((average7 / 1000) * 10);
		int sixth = average7 / 10 - ((average7 / 100) * 10);
		int seventh = average7 - ((average7 / 10) * 10);

		System.out.println((first + second + third + fourth + fifth + sixth + seventh) / 7);
	}
}
