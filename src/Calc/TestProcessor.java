
package Calc;

public class TestProcessor extends AbstractProcessor {
	final static char[] numbers = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	final static char[] operations = { '=', '-', '+', '/', '*', 'C' };
	final static String[] buttons = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+", "/", "*", "=", "C" };
	private String tempr = "";
	private char opr = '+';

	@Override
	public void inputChar(char c) {
		if (!TestProcessor.charValidation(c)) {
			System.out.println("Wrong input");
		} else {
			if (!TestProcessor.isOper(c) | (c == '-' & tempr == "")) {
				tempr = tempr.concat(String.valueOf(c));
			} else {
				if (c != '=') {
					this.setTemp(Integer.parseInt(tempr));
					tempr = "";
					opr = c;
				} else {
					switch (opr) {
					case '+':
						this.setResult(this.getTemp() + Integer.parseInt(tempr));
						tempr = "";
						this.setTemp(0);
						break;						
					case '-':
						this.setResult(this.getTemp() - Integer.parseInt(tempr));
						tempr = "";
						this.setTemp(0);
						break;
					case '/':
						this.setResult(this.getTemp() / Integer.parseInt(tempr));
						tempr = "";
						this.setTemp(0);
						break;
					case '*':
						this.setResult(this.getTemp() * Integer.parseInt(tempr));
						tempr = "";
						this.setTemp(0);
						break;
					}
				}
			}
		}
	}

	@Override
	public void printResult() {
		if (this.getResult() != 0) {
			System.out.println("Result = " + getResult());
			this.setResult(0);
		}

	}

	public static boolean charValidation(char c) {
		for (int i = 0; i < TestProcessor.numbers.length; i++) {
			if (c == TestProcessor.numbers[i]) {
				return true;
			} else {
				for (int j = 0; j < TestProcessor.operations.length; j++) {
					if (c == TestProcessor.operations[j]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean isOper(char c) {
		for (int i = 0; i < TestProcessor.operations.length; i++) {
			if (c == TestProcessor.operations[i]) {
				return true;
			}
		}
		return false;
	}
}

