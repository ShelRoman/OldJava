//Task7. �������� ����� factorial, ����������� ��������� �����.
package lesson4;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����:");
		int fakt = scan.nextInt();
		System.out.println(getFaktorial(fakt));

	}
	
	public static int getFaktorial(int a) {
		int result = 1;
		for (int i = 1; i <= a; i++ ) {
			result = result * i;
		}
		return result;
	}

}
//done
