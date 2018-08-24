/*Task 5. ћетод, который выводит список на экран. 
 * ‘ормат вывода:
 * [0] = 10
 * [1] = 20
 * [2] = 30 */
package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите размер списка");
		int size = scan.nextInt();
		fillList(list, size);
		printList(list);
	}

	public static void fillList(ArrayList<Integer> list, int size) {
		for (int i = 0; i < size; i++) {
			list.add((int) (100 * Math.random()));
		}
	}

	public static void printList(ArrayList<Integer> list) {
		for (int i = 0; i< list.size(); i++) {
			System.out.println("[" + i + "]" + " = " + list.get(i));
		}
	}
}
//done
