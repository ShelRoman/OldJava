package lesson4;

import java.util.Scanner;

public class Task2 {

	public static int getSumma(int a1, int b1){
		int res = a1 + b1;
		return res;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите первое число:");
		int a = scan.nextInt();
		System.out.println("¬ведите второе число:");
		int b = scan.nextInt();
		int summa = getSumma(a,b);
		System.out.println("summa(" + a + "," + b + ")=" + summa);
	}
}
//done