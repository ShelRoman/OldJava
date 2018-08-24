//Task7. Написать метод boolean myEquals, который принимает две строки.(не используя equals)

package week1.lesson1;

public class Task7 {

	public static void main(String[] args) {
		String line1 = "axccx";
		String line2 = "asdasd";
		System.out.println(myEquals(line1, line2));
	}

	public static boolean myEquals(String line1, String line2) {
		// comparing length
		if (line1.length() != line2.length()) {
			return false;
		} else {
			// comparing each char step by step
			for (int i = 0; i < line1.length(); i++) {
				if (line1.charAt(i) != line2.charAt(i)) {
					// stops if mismatch
					return false;
				}
			}
			return true;
		}
	}
}
// done