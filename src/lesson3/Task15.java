/*Task15. ������� ������ ����� (������ c �������), ��������� ������ ���������� �� 0 �� 100, 
������� �� ����� ������ �������� �������.*/
package lesson3;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����");
		int n = scan.nextInt();
		int[] vector = new int[n];
		for(int i = 0; i < vector.length; i++) {
			vector[i] = (int)(100 * Math.random());

		}
		for(int i = 0; i < vector.length / 2; i++) {
			System.out.print(vector[i] +", ");
		}
	}
}
//done