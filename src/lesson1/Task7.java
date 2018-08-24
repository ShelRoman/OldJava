package lesson1;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите сумму денег:");
		double money = scan.nextDouble();
		double change = (money - (int)money)*100;
		System.out.println((int)change);

	}

}
