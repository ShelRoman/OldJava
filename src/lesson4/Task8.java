/*Task8. �������� �����, ������� ��������� ����� k, ������� ������ �� k ���������, 
 ��������� ������� �� 10 �� ... � ����� 2 (����������) � ���������� ������.
  � main �������� ���������� ���� ������ � ��������� �� ����� ����� ������.
  �������� � ������ ����� ������ ������� �� �����. */
package lesson4;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������� �����");
		int k = scan.nextInt();
		int[] vectRes = createVector(k);
		printVector(vectRes);
	}
	
	public static int[] createVector(int k) {
		int[] vect = new int [k];
		int fillNum = 10;		
		for(int i = 0; i < vect.length; i++){
			vect[i] = fillNum;
			fillNum += 2;
		}
		return vect;
	}

	public static void printVector(int[] vect) {
		for(int i = 0; i < vect.length; i++){
			System.out.print(vect[i] + ", ");
	    }
		System.out.println();
	}

}
//done
