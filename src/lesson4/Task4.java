/* Task4. �������� ����� getMax, ������� ��������� ��� ����� ����� � ���������� ������������.
� main ������� ��� ����� ����� � �������� ������ getMax. */
package lesson4;

import java.util.Scanner;

public class Task4 {

	public static int getMax(int a1, int b1){
		int res = 0;
		if (a1 > b1) {
			res = a1;
		}
		else if (b1 > a1) {
			res = b1;
		}
		else {
			System.out.println("����� �����");
		}
		return res;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ������ �����:");
		int a = scan.nextInt();
		System.out.println("������� ������ �����:");
		int b = scan.nextInt();
		int max = getMax(a,b);
		System.out.println("������� ����� "+ max);
	}

}
//done