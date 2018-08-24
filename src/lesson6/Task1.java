/*Task 1. Написать метод, который заполняет файл четными числами от k1 до к2.
 Все числа в отдельной строке.
 Этот метод принимает имя файла , к1 и к2 в качестве параметра.*/
package lesson6;

import java.io.FileWriter;
import java.util.Scanner;

class Task1 {

	public static void main(String[] args) throws Exception {
		String sFileName = "file2.txt";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите начальное число");
		int k1 = scan.nextInt();
		System.out.println("Введите конечное число");
		int k2 = scan.nextInt();
		myMethod(sFileName, k1, k2);
	}

	public static void myMethod(String sFileName, int k1, int k2)
			throws Exception {
		FileWriter fw = new FileWriter(sFileName);
		// цикл для четного числа
		if (k1 % 2 == 0) {
			for (int i = k1; i <= k2; i += 2) {
				fw.write(i + "\n");
			}
			// цикл для нечетного числа
		} else {
			for (int i = k1 + 1; i <= k2; i += 2) {
				fw.write(i + "\n");
			}
		}
		fw.close();
	}
}
// done