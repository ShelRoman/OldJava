/*(for)������� � ������� ��� �����, �������� k � n.(k < n).
 ������� ����� �� k �� n. */
package lesson3;

import java.util.Scanner;


public class Task2 {

	public static void main(String[] args) {
		f();

	}
	
	public static void f() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� 2 �����");
		int k = scan.nextInt();
		int n = scan.nextInt();
		
		for(int i = k; i < n; i++) {
			System.out.print(i + ", ");
		}
			
	}
}
//done