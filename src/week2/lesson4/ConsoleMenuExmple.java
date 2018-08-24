package week2.lesson4;

import java.util.Scanner;

public class ConsoleMenuExmple {
	
	private static String[] operationNames = { "1. Прийти", "2. Уйти",
			"3. Зайти", "4. Выйти" };


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			for (String m : operationNames) {
				System.out.println(m);
			}
			System.out.println("Выберите операцию:");
			int k = scan.nextInt();
			switch (k) {
			case 1: f1(); break;
			case 2:	f2(); break;
			case 3:	f3(); break;
			case 4:	runWhile = false;
			}
		}
	}

	public static void f1() {
		System.out.println("Method1");
	}

	public static void f2() {
		System.out.println("Method2");
	}

	public static void f3() {
		System.out.println("Method3");
	}
}