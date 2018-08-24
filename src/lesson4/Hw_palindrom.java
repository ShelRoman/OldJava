package lesson4;

public class Hw_palindrom {

	public static void main(String[] args) {
		int[] vect = { 0, 42, 3, 5, 5, 3, 42, 0 };
		System.out.println(isVectorPalindrom(vect));

	}

	public static boolean isVectorPalindrom(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != vector[vector.length - 1 - i]) {
				return false;
			}
		}
		return true;

	}
}
// done