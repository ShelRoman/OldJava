/* Task1. �������� ���������, ��� � ����� �������� ���������� ������ � ������, ������� ��������� � �������� ��������� ���� ������:
 - ����� ���������� ����������� ������� ���������� ������� �� 10 �� 20
 - ����� ������ ����������� ������� �� ����� 
 - ����� ���������� �������� ���� ��������� ����� */
package lesson5;

import java.lang.Math;

public class Task1 {

	public static void main(String[] args) {
		int[][] vector = new int[5][5];
		fillVector(vector);
		printVector(vector);
		increaseVector(vector);
		System.out.println();
		System.out.print("-----------------");
		printVector(vector);
	}

	public static void fillVector(int[][] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				vector[i][j] = (int) (10 + (10 * Math.random()));
			}
		}
	}

	public static void printVector(int[][] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println();
			for (int j = 0; j < vector[i].length; j++) {
				System.out.print(vector[i][j] + ", ");
			}
		}
	}

	public static void increaseVector(int[][] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				vector[i][j] *= 2;
			}
		}
	}

}
//done