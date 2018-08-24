/*Task5. �������� �����, ������� ��������� � �������� ��������� ����� k � n. 
����� ������� ��� ������ ����� �� k �� n.
� main ������� ��� ����� � �������� ����� ������.*/
package lesson4;

import java.util.Scanner;

public class Task5 {

	public static void printEven(int k, int n) {
		if (k > n && (k %2 == 0)) {
			for (int i = k; i >= n; i= i - 2) {
			System.out.print(i + " ");
			}
		}
		else if (k > n && (k %2 != 0)) {
			for (int i = k-1; i >= n; i= i - 2) {
			System.out.print(i + " ");
			}
		}
		else if (k < n && (k %2 == 0)) {
			for (int i = k; i <= n; i= i + 2) {
			System.out.print(i + " ");
			}
		}
		else if (k < n && (k %2 != 0)) {
			for (int i = k+1; i <= n; i= i + 2) {
			System.out.print(i + " ");
			}
		}
		else {
			System.out.print(k);
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ������ �����:");
		int a = scan.nextInt();
		System.out.println("������� ������ �����:");
		int b = scan.nextInt();
		printEven(a, b);  
	}

}
//done
