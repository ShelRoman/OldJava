package lesson6;

import java.io.FileReader;
import java.util.Scanner;

public class FileReaderExmple {
	public static void main(String[] args) throws Exception {
		// Чтение файла
		String fileName = "file1.txt";
		FileReader fr = new FileReader(fileName);
		Scanner scan = new Scanner(fr);

		String s1 = scan.nextLine();
		System.out.println(s1);
		if (scan.hasNextLine()) {
			System.out.println(" вторая строка:" + scan.nextLine());
		}
		if (scan.hasNextLine()) {
			System.out.println(" третья строка:" + scan.nextLine());
		}
		scan.close();
	}
}