/*Task2. Запросить путь на папку с консоли, получить список всех папок заданной папки с учетом иерархии.
Например, поиск в папке "book" даст 5 элементов:
-book
--directory1
----file1
----file2
--directory2
----directory3
------directory4
--------directory5
----------file3*/
package week4.lesson7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Input name of directory, please:");
		String dir = scan.nextLine();

		ArrayList<File> files = new ArrayList<>();
		int slashCount = 0;
		for (int i = 0; i < dir.length(); i++) {
			if (dir.charAt(i) == '\\') {
				slashCount++;
			}
		}

		while (slashCount > 1) {
			File[] tempFiles = new File(dir).listFiles();
			for (int i = 0; i < tempFiles.length; i++) {
				if (tempFiles[i].isDirectory()) {
					files.add(tempFiles[i]);
				}
			}
			int slashIndex = 0;
			for (int j = dir.length() - 1; j >= 2; j--) {
				if (dir.charAt(j) == '\\') {
					slashIndex = j;
					break;
				}
			}
			dir = dir.substring(0, slashIndex);
			slashCount--;
		}

		for (int i = files.size() - 1; i >= 0; i--) {
			System.out.println(files.get(i).getName());
		}

	}
}
