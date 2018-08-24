//Task 11: Написать метод, который принимает строку и возвращает массив целых чисел с индексами, где встречаются символы 'а'.
package lesson5;

public class Task11 {

	public static void main(String[] args) {
		String array = "abra kadabra";
		printVector(arrayA(array));

	}
	public static int[] arrayA(String array) {
		int aCount = 0;
		for (int i = 0; i < array.length(); i++) {
			if (array.charAt(i) == 'a') {
				aCount += 1;
			}
		}
		int[] arrayA = new int [aCount];
		int j = 0;
		for (int i = 0; i < array.length(); i++) {
			if (array.charAt(i) == 'a') {
				arrayA[j] = i;
				j++;
			}
		}
		return arrayA;
	}
		
	public static void printVector(int[] vect) {
		System.out.print("{");
		for(int i = 0; i < vect.length -1 ; i++){
			System.out.print(vect[i] + ", ");
	    }
		System.out.print(vect[vect.length - 1] + "}");
	}

}
//done
