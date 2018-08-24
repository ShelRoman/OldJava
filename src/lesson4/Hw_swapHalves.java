/*
 * Ќаписать метод мен€ющий местами половины массива, если размер нечетный - центральный элемент не учитываетс€
 * ¬ случае, если размер вектора некорректный, выводить сообщение "Ќеверный размер вектора", иначе выводить массив в красивом формате [1, 2, 3]
 * ћетод: void swapHalves(int[] vector)
 * ѕример:
 * swapHalves(int[] vector); // [1234567]
 * [5, 6, 7, 4, 1, 2, 3]
 */
package lesson4;

public class Hw_swapHalves {

	public static void main(String[] args) {
		// создаем массив
		int[] vect = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		swapHalves(vect);

	}

	public static void swapHalves(int[] vector) {
		if (vector.length < 1) {
			System.out.println("Ќеверный размер вектора");
		} else if (vector.length == 1) {
			System.out.println("[" + vector[0] + "]");
		} else {
			if (vector.length % 2 == 0) {
				System.out.print("[");
				for (int i = vector.length / 2; i < vector.length; i++) {
					System.out.print(vector[i] + ", ");
				}
				for (int j = 0; j < vector.length / 2 - 1; j++) {
					System.out.print(vector[j] + ", ");
				}
				System.out.print(vector[vector.length / 2 - 1] + "]");
			} else {
				System.out.print("[");
				for (int i = vector.length / 2 + 1; i < vector.length; i++) {
					System.out.print(vector[i] + ", ");
				}
				System.out.print(vector[vector.length / 2] + ", ");
				for (int j = 0; j < vector.length / 2 - 1; j++) {
					System.out.print(vector[j] + ", ");
				}
				System.out.print(vector[vector.length / 2 - 1] + "]");
			}
		}
	}

}