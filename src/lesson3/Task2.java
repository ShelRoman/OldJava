/*(for)Считать с консоли два числа, например k и n.(k < n).
 Вывести числа от k до n. */
package lesson3;

import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		f();

	}
	
	public static void f() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите 2 числа");
		int k = scan.nextInt();
		int n = scan.nextInt();
		
		for(int i = k; i < n; i++) {
			System.out.print(i + ", ");
		}
			
	}
}
//done