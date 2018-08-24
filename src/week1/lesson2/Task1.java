package week1.lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("CaesarPlate.txt");
		fw.write("123\n 456");// \n \r\n
		fw.write("\n789");
		fw.flush();
		fw.close();

		FileReader fr = new FileReader("CaesarPlate.txt");
		Scanner scan = new Scanner(fr);
		int i = 0;
		while (scan.hasNextLine()) {
			System.out.println("строка с номером :" + i + ": "
					+ scan.nextLine());
			i++;
		}
		scan.close();

	}
}
