/* ������� ������ �� n ��������� ����� �����. ��������� ���������� ���������� �� 0 �� 100.
 �������� ������� ������ � ��������� �������.*/
package lesson3;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����");
		int n = scan.nextInt();
		int[] vector = new int[n];
		for(int i = 0; i < vector.length; i++){
			vector[i] = (int)(100 * Math.random());
		}
		
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i] + ", ");
	    }
		
	    int store0 = vector[0];
	    int storeX = vector[(int) vector.length - 1];
	    vector[0] = storeX;
		vector[(int)vector.length - 1] = store0;
		
	    System.out.println("");
	    for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i] + ", ");
	    }
	}

}

//done