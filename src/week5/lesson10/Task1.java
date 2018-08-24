//Task 1. Ќаписать метод дл€ конвертации массива строк(или чисел) в список строк(или чисел).
package week5.lesson10;

import java.util.ArrayList;

public class Task1 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
//		String[] stringVect = {"string1" , "string2", "string3" };
//		Integer[] intVect = {1, 2, 3, 4, 5 };
//		ArrayList<Integer> intArray = vectorToArray(intVect);
//		ArrayList<String> stringArray = vectorToArray(stringVect);
//		printList(intArray);
//		printList(stringArray);
		
		Integer[] list = {1,2,3,5,6};
		String[] list2 = {"string1", "string2", "string3"};
		Task2 stringG = new Task2(list2);
		System.out.println(stringG.getValue(2));
		Task2 intG = new Task2(list);
		System.out.println(intG.getValue(2));
	}
	
	public static <T> ArrayList<T> vectorToArray(T[] vector) {
		ArrayList<T> array = new ArrayList<T>();
		for (T values : vector) {
			array.add(values);
		}
		return array;
	}
	
	public static <T> void printList(ArrayList<T> array) {
		for (T values : array){
			System.out.println(values);
		}
		
	}
}
