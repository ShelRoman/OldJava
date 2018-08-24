/* Task 4. Написать метод заполнения списка случайными целыми числами от 0 до 100.
 * Метод принимает список и кол-во элементов. */
package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите размер списка");
		int size = scan.nextInt();
		fillList(list, size);
	}
	
	public static void fillList (ArrayList<Integer> list, int size) {
		for (int i = 0; i < size; i++) {
			list.add((int)(100 * Math.random()));
		}
		System.out.println(list);
	}
}
//done