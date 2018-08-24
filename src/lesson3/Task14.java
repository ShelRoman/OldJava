/*Task14. —оздать массив из n елементов, заполнив их случайными значени€ми от 0 до 100. Ќайти максимальное значение в массиве.*/
package lesson3;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите число");
		int n = scan.nextInt();
		int[] vector = new int[n];
		for(int i = 0; i < vector.length; i++) {
			vector[i] = (int)(100 * Math.random());
		}
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i] + ", ");
		}
		System.out.println();
		getMax(vector);
	}
	
	public static void getMax(int[] vect) {
		int maxX = vect[0];
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] >= maxX) {
				maxX = vect[i];
			}
			
		}
		System.out.println(maxX);
	}
}
//done