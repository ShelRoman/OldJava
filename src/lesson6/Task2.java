//Task 2. Написать метод, который принимает имя файла и возвращает количество строк в файле. 
package lesson6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException {
		String sFileName = "file2.txt";
		System.out.println(lineQty(sFileName));

	}

	public static int lineQty(String fileName) throws FileNotFoundException {
		FileReader fr = new FileReader(fileName);
		Scanner scan = new Scanner(fr);
		int lineQty = 0; // переменная для хранения к-ва строк файла
		// cчитаем к-во строк
		while (scan.hasNextLine()) {
			lineQty += 1;
			scan.nextLine();
		}
		scan.close();
		return lineQty;
	}
}
// done