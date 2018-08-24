/*Task12.
Написать метод, который принимает массив целых чисел vector и возвращает массив четных чисел.
При этом размер возвращаемого массива соответствует количеству четных чисел из массива vector.*/
package lesson4;

public class Task12 {

	public static void main(String[] args) {
		int[] arrayExm = new int[15];
		fillVectorByRandom(arrayExm);
		printVector(arrayExm);
		arrayExm = evenArray(arrayExm);
		printVector(arrayExm);

	}

	public static int[] evenArray(int[] vect) {
		int evenCount = 0;
		for (int i = 0; i < vect.length; i++) {
			if (((double) vect[i] / 2) - (vect[i] / 2) == 0 & vect[i] != 0) {
				evenCount += 1;
			}
		}
		int[] vectEven = new int[evenCount];
		int j = 0;
		for (int i = 0; i < vect.length; i++) {
			if (((double) vect[i] / 2) - (vect[i] / 2) == 0 & vect[i] != 0) {
				vectEven[j] = vect[i];
				j++;
			}

		}
		return vectEven;
	}

	public static void fillVectorByRandom(int[] vect) {
		for (int i = 0; i < vect.length; i++) {
			vect[i] = (int) (100 * Math.random());
		}
	}

	public static void printVector(int[] vect) {
		for (int i = 0; i < vect.length - 1; i++) {
			System.out.print(vect[i] + ", ");
			
		}
		int y = vect.length - 1;
		System.out.print(vect[y]);
		System.out.println();
	}
}
//done
