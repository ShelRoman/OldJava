//Task8. Написать метод int MyIndexOf, который принимает две строки.(не используя indexOf)

package week1.lesson1;

public class Task8 {

	public static void main(String[] args) {
		String line1 = "abrakadabra";
		String line2 = "br";
		System.out.println(myIndexOf(line1, line2));
	}

	public static int myIndexOf(String line1, String line2) {
		int index = -1;
		if (line2.length() > line1.length()) {
			return index;
		}
		if (line1.equals(line2)) {
			index = 0;
		} else {
			for (int i = 0; i < line1.length(); i++) {
				if (line2.charAt(0) == line1.charAt(i)) {
					index = i;
					for (int j = 0; j < line2.length(); j++) {
						if (line2.charAt(j) != line1.charAt(i)) {
							index = -1;
							break;
						} else if (j == line2.length() - 1) {
							return index;
						}
						i++;
					}
				}
			}
		}
		return index;
	}
}
// done