/* Task 5(charAt). Написать метод, определяющий равны ли первый и последний символ в строке.*/
package lesson5;

public class Task5 {

	public static void main(String[] args) {
		String s = "abcdefa";
		System.out.println(isEqual(s));

	}

	public static boolean isEqual(String eql) {
		if (eql.charAt(0) == eql.charAt(eql.length() - 1)) {
			return true;
		}
		return false;
	}
}
//done