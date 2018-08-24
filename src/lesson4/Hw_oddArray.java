/*Написать метод возвращающий количество нечетных элементов массива
В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора"
Метод: int calcNonPairCount(int[] vector)
Пример:
 calcNonPairCount(int[] vector); // [1234567]
 4*/
package lesson4;

public class Hw_oddArray {

	public static void main(String[] args) {
		int[] vector = { 1, 3, 5, 2, 4, 7, 12, 13, 25 };
		System.out.println(calcNonPairCount(vector));
	}

	public static int calcNonPairCount(int[] vector) {
		int oddCount = 0;
		if (vector.length < 1) {
			System.out.println("Неверный размер вектора");
		} else {
			for (int i = 0; i < vector.length; i++) {
				if ((((double) vector[i] / 2) - ((int) vector[i] / 2)) != 0) {
					oddCount += 1;
				}
			}
		}

		return oddCount;

	}
}

//done