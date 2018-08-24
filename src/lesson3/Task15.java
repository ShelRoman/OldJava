/*Task15. Создать массив целых (размер c консоли), заполнить любыми значениями от 0 до 100, 
Вывести на экран первую половину массива.*/
package lesson3;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		int n = scan.nextInt();
		int[] vector = new int[n];
		for(int i = 0; i < vector.length; i++) {
			vector[i] = (int)(100 * Math.random());

		}
		for(int i = 0; i < vector.length / 2; i++) {
			System.out.print(vector[i] +", ");
		}
	}
}
//done