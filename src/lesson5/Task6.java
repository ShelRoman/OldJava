/* Task 6(indexOf). �������� ����� � �������� ��������� ������ ��������� 2 ������ s � s1.
 ���������� ������ �� ������ s � ������ s1.(�������� �� s ���������� s1).
 ����� ������ ������� �������� boolean. (true - ���� ������)  */
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