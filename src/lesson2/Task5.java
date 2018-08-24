package lesson2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your age %username%?:");
		int k1 = scan.nextInt();
		if (k1 >= 18 && k1 < 60)
			System.out.println("You get the job");
		else if (k1 < 18)
			System.out.println("You're child");
		else
			System.out.println("You're retired");
	}

}
// done

