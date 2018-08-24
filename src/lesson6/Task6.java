/*  Task 6. Метод, который вставляет элемент внутрь списка и возвращает его.
 * insertElement(ArrayList<Integer> vector, int index, Integer element) */
package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите размер списка");
		int size = scan.nextInt();
		fillList(list, size);
		printList(list);
		printList(insertElement(list, 3, 2));
		}

	public static void fillList(ArrayList<Integer> list, int size) {
		for (int i = 0; i < size; i++) {
			list.add((int) (100 * Math.random()));
		}
	}

	public static void printList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + i + "]" + " = " + list.get(i));
		}
	}

	public static ArrayList<Integer> insertElement(ArrayList<Integer> vector,
			int index, Integer element) {
		if (index >= vector.size()) {
			System.out.println("Индекс находиться за рамками массива");
		} else {
			vector.set(index, element);
		}
		return vector;
	}
}
// done