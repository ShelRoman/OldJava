/* Task 5(charAt). �������� �����, ������������ ����� �� ������ � ��������� ������ � ������.*/
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