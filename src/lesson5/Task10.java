/* Task 10: �������� �����, ����������� �������� �� ������ �����������. 
 ������ ������� ��������� �������� ������ ������ � ����� �������.(����,������) */

package lesson5;

public class Task10 {

	public static void main(String[] args) {
		String palindrom = "atamata";
		System.out.println(isStringPalindrom(palindrom));
		

	}
	public static boolean isStringPalindrom(String string) {

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;
			}
		}
		return true;

	}
}
//done