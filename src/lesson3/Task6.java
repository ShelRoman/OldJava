// � main ������� � ���������� ����� � � �������� ������ f. � ������� ������ f ������� �� ����� � ���������.
package lesson3;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����");
		int k = scan.nextInt();
		f(k);
		
	}
			
	public static void f(int k) {
		for(int i = 0; i < k; i++) {
			System.out.print("*");
		}
	}
			
}
//done

