package lesson6;

import java.util.ArrayList;

public class ArrayExmple {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("size1=" + list.size());
		list.add(120);
		System.out.println("size2=" + list.size());
		list.add(10);
		System.out.println("size3=" + list.size());
		Integer p = new Integer(50);
		list.add(p);
		@SuppressWarnings("unused")
		int k = list.get(2);
		System.out.println("get[0]=" + list.get(0));
		System.out.println("get[2]=" + list.get(2));
		System.out.println("2 * get[2]=" + 2 * list.get(2));
		// System.out.println(list.get(5));
	}
}