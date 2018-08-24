/* Task 6(indexOf). Написать метод в качестве параметра должен принимать 2 строки s и s1.
 Определить входит ли строка s в строку s1.(является ли s подстрокой s1).
 Метод должен вернуть значение boolean. (true - если входит)  */
package lesson5;

public class Task6 {

	public static void main(String[] args) {
		String s = "abcdh";
		String s1 = "abcdefgh";
		System.out.println(isInside(s, s1));

	}

	public static boolean isInside(String s, String s1) {
		if (s1.indexOf(s) < 0) {
			return false;
		}
		return true;
	}

}
//done