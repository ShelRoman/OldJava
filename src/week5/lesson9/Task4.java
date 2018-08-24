//HomeTask1. � ������� System.nanoTime() �������������� �������� ������ ���������� ����������:
// - ��������
// - ���������
// - ���������
// - �����(��������� ���������)
// - ���������
// - �����
// ����� �������� �������, ����: 
// - ������� 100 ��������� 
// - ������� 1000 ���������
// - ������� 10000 ���������
package week5.lesson9;

import java.util.Arrays;

public class Task4 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] arr1 = new int[500];
		long timeBegin;
		long t2;
		long scoreTime;
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = (int) (Math.random() * 100);

		System.out.println(Arrays.toString(arr1));
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOf(arr1, arr1.length);
		int[] arr4 = Arrays.copyOf(arr1, arr1.length);

		if (Arrays.equals(arr1, arr2))
			System.out.println("�����");
		else
			System.out.println("�� �����");
		//
		timeBegin = System.nanoTime();
		bubblesort(arr1);
		scoreTime = System.nanoTime() - timeBegin;

		System.out.print("bubblesort(arr1)= ");
		if (scoreTime < 10000000)
			System.out.print("0");
		System.out.println(scoreTime);
		//
		timeBegin = System.nanoTime();
		bubblesort(arr2);
		scoreTime = System.nanoTime() - timeBegin;

		System.out.print("bubblesort(arr2)= ");
		if (scoreTime < 10000000)
			System.out.print("0");
		System.out.println(scoreTime);
		//
		timeBegin = System.nanoTime();
		bubblesort(arr3);
		scoreTime = System.nanoTime() - timeBegin;

		System.out.print("bubblesort(arr3)= ");
		if (scoreTime < 10000000)
			System.out.print("0");
		System.out.println(scoreTime);
		//
		timeBegin = System.nanoTime();
		bubblesort(arr4);
		scoreTime = System.nanoTime() - timeBegin;

		System.out.print("bubblesort(arr4)= ");
		if (scoreTime < 10000000)
			System.out.print("0");
		System.out.println(scoreTime);
	}

	public static void bubblesort(int[] arr) {
		for (int k = 0; k < arr.length - 2; k++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
