//Task 9: Написать метод, возвращающий вторую половину строки.

package lesson5;

public class Task9 {

	public static void main(String[] args) {
		String string = "abra kadabra";
		System.out.println(halfString(string));
	}

	public static String halfString(String string) {
		String half = string.substring(string.length() / 2);
		return half;
	}

}
//done