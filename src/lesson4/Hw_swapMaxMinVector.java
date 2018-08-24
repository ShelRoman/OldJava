/*
 * Написать метод, меняющий местами первые найденные наибольший и наименьший элементы вектора.
В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора"
Название метода: swapMaxMinVector
Пример:
 swapMaxMinVector(int[] vector); // [4,4,3,3,1,1]
 [1,4,3,3,4,1]
 */
package lesson4;

import java.lang.Math;

public class Hw_swapMaxMinVector {

	public static void main(String[] args) {
		int[] vect = new int[(int) (30 * Math.random())];
		for (int i = 0; i < vect.length; i++) {
			vect[i] = (int) (100 * Math.random());
		}
		System.out.print("[");
		for (int i = 0; i < vect.length - 1; i++) {
			System.out.print(vect[i] + ", ");
		}
		System.out.print(vect[vect.length - 1] + "]");
		System.out.println();
		swapMaxMinVector(vect);
	}

	public static void swapMaxMinVector(int[] vect) {
		if (vect.length < 1) {
			System.out.println("Неверный размер вектора");
		} else if (vect.length == 1) {
			System.out.println("[" + vect[0] + "]");
		} else {
			int maxVal = 0;
			int minVal = vect[0];
			int maxInd = 0;
			int minInd = 0;
			for (int i = 0; i < vect.length; i++) {
				if (vect[i] > maxVal) {
					maxVal = vect[i];
					maxInd = i;

				} else if (vect[i] < minVal) {
					minVal = vect[i];
					minInd = i;
				}
			}
			vect[minInd] = maxVal;
			vect[maxInd] = minVal;
			System.out.print("[");
			for (int i = 0; i < vect.length - 1; i++) {
				System.out.print(vect[i] + ", ");
			}
			System.out.print(vect[vect.length - 1] + "]");
		}

	}
}
