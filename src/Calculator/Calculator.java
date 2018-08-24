package Calculator;

public abstract class Calculator {
	final static char[] nums = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.' };
	final static char[] commands = { '+', '-', '/', '*' };

	public static boolean isInt(char x) {
		for (int i = 0; i < Calculator.nums.length; i++) {
			if (Calculator.nums[i] == x) {
				return true;
			}
		}
		return false;
	}

	public static boolean isOpr(char x) {
		for (int i = 0; i < Calculator.commands.length; i++) {
			if (Calculator.commands[i] == x) {
				return true;
			}
		}
		return false;
	}

	public static boolean isStringOk(String string) {
		int oprCount = 0;
		int separCount = 0;
		int intCount = 0;
		for (int j = 0; j < string.length(); j++) {
			if (string.charAt(j) == ',' | string.charAt(j) == '.') {
				separCount++;
			}
			if (Calculator.isOpr(string.charAt(j))) {
				oprCount++;
			}
			if (Calculator.isInt(string.charAt(j))) {
				intCount++;
			}
		}
		if (oprCount > 3 | separCount > 2 | intCount < 1) {
			return false;
		}
		for (int i = 0; i < string.length(); i++) {
			if (!Calculator.isInt(string.charAt(i))	& !Calculator.isOpr(string.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
