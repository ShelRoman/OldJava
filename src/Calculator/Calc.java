package Calculator;

import java.util.Scanner;

public class Calc extends Calculator {
	private double firstVal;
	private double secondVal;
	private double result;
	private double shortVal;

	@SuppressWarnings({ "resource" })
	public void start() {
		boolean on = true;
		Scanner scan = new Scanner(System.in);
		String temp = "";
		while (on) {
			temp = scan.nextLine();
			if (temp.equals("exit")) {
				on = false;
				break;
			} else if (temp.charAt(0) == '=') {
				System.out.println(result);
			} else if (temp.length() == 1) {
				if (isOpr(temp.charAt(0))) {
					this.oneKeyScen(temp);
				} else {
					System.out.println("Wrong input!");
				}
			} else {
				temp = temp.replace(',', '.');
				temp = temp.replaceAll("\\s", "");
				if (!isStringOk(temp)) {
					System.out.println("Wrong input!");
				} else {
					if (isOpr(temp.charAt(0)) & temp.charAt(0) != '-') {
						this.shortScen(temp);
					} else if (isOpr(temp.charAt(0))
							& temp.charAt(0) == '-') {
						boolean oprCount = false;
						for (int i = 1; i < temp.length(); i++) {
							if (isOpr(temp.charAt(i))) {
								oprCount = true;
							}
						}
						if (!oprCount) {
							this.shortScen(temp);
						} else {
							this.normScen(temp, this.findIndex(temp));
						}
					} else {
						this.normScen(temp, this.findIndex(temp));
					}
				}
			}

		}
	}

	public void shortScen(String temp) {
		shortVal = Double.parseDouble(temp.substring(1, temp.length()));
		switch (temp.charAt(0)) {
		case '+':
			result += shortVal;
			System.out.println(result);
			break;
		case '-':
			result -= shortVal;
			System.out.println(result);
			break;
		case '/':
			result /= shortVal;
			System.out.println(result);
			break;
		case '*':
			result *= shortVal;
			System.out.println(result);
			break;
		default:
			System.out.println("Wrong input!");
			break;
		}
	}

	public void normScen(String temp, int j) {
		firstVal = Double.parseDouble(temp.substring(0, j));
		secondVal = Double.parseDouble(temp.substring(j + 1, temp.length()));
		switch (temp.charAt(j)) {
		case '+':
			result = firstVal + secondVal;
			System.out.println(result);
			break;
		case '-':
			result = firstVal - secondVal;
			System.out.println(result);
			break;
		case '/':
			result = firstVal / secondVal;
			System.out.println(result);
			break;
		case '*':
			result = firstVal * secondVal;
			System.out.println(result);
			break;
		default:
			System.out.println("Wrong input!");
			break;
		}
	}

	// FIXME addition for normScen method
	public int findIndex(String temp) {
		for (int j = 1; j < temp.length(); j++) {
			if (isOpr(temp.charAt(j))) {
				return j;
			}
		}
		return 0;
	}

	public void oneKeyScen(String temp) {
		switch (temp.charAt(0)) {
		case '+':
			result += result;
			System.out.println(result);
			break;
		case '-':
			result -= result;
			System.out.println(result);
			break;
		case '/':
			result /= result;
			System.out.println(result);
			break;
		case '*':
			result *= result;
			System.out.println(result);
			break;
		default:
			System.out.println("Wrong input!");
			break;
		}
	}
}
