/*Task10. Создать массив из n элементов целых чисел. Заполнить случайными значениями от 0 до 100.
 Во 2-й элемент поместить сумму 2-го и 3-го элемента.*/
package lesson3;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		int n = scan.nextInt();
		int[] vector = new int[n];
		for(int i = 0; i < vector.length; i++){
			vector[i] = (int)(100 * Math.random());
		}
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i] + ", ");
	    }
	    vector[2] = vector[0] + vector[1];
	    System.out.println("");
	    for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i] + ", ");
	    }
	}

}

//done