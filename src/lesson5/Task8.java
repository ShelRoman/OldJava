/* Task 8. Ќаписать метод, принимающий в качестве параметра строку. ¬озвращающий перевернутую строку. */

package lesson5;

public class Task8 {

	public static void main(String[] args) {
		String string = "abra kadabra";
		System.out.println(reverseString(string));
	}
	
	public static String reverseString(String string) {
		String reverseString = "";
		for (int i = string.length() - 1; i >= 0; i-- ) {
			reverseString += string.charAt(i);
		}
		return reverseString;
	}
}
//done