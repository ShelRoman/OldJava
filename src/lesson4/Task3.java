package lesson4;

import java.util.Scanner;

public class Task3 {

	public static void printMax(int a1, int b1) {
		int res = 0;
		if (a1 > b1) { 
			res = a1;
		}
		else if (a1 < b1) {
			res = b1;
		}
		else {
			System.out.println("����� �����");
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ������ �����:");
		int a = scan.nextInt();
		System.out.println("������� ������ �����:");
		int b = scan.nextInt();
		printMax(a, b);  
	}

}
//done