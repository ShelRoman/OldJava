/* Task 7. Метод, который ищет элемент в списке и возвращает кол-во этих элементов.
 * getCountElementByArrayList(ArrayList<Integer> vector, Integer element)*/
package lesson6;

import java.util.ArrayList;

public class Task7 {

	public static void main(String[] args) {
		ArrayList<Integer> vector = new ArrayList<Integer>();
		fillList(vector, 33);
		int element = 2;
		System.out.println(getCountElementByArrayList(vector, element));
		printList(vector);

	}
	
	public static int getCountElementByArrayList(ArrayList<Integer> vector, Integer element) {
		int count = 0;
		for (int i = 0; i < vector.size(); i++) {
			if (vector.get(i) == element) {
				count++;
			}
		}
		return count;
	}
	
	public static void fillList(ArrayList<Integer> list, int size) {
		for (int i = 0; i < size; i++) {
			list.add((int) (10 * Math.random()));
		}
	}
	
	public static void printList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + i + "]" + " = " + list.get(i));
		}
	}
	
}
//done