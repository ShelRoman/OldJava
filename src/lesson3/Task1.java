package lesson3;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		f();
	}
	
	public static void f() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите число");
		int m = scan.nextInt();
		
		for(int i = 2; i <= m; i++) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		int j = 2;
		while(j <= m) {
			System.out.print(j + ", ");
			j++;
		}
		
	}
	
}
//done
