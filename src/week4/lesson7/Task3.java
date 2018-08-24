/*Task3. Запросить с консоли путь на папку. Создать в этой директории файл "directory.txt" и заполнить этот файл (без использования рекурсии) 
 список всех файлов и папок этой папки, с вложеннной иерархией.
 Если файл "directory.txt" уже существует, то не перезаписывать этот файл, а добавить в него новую информацию.*/
package week4.lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;

public class Task3 {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Input name of directory, please:");
		String dir = scan.nextLine();
		File direct = new File(dir + "\\" + "directory.txt");
		if (!direct.exists()) {
			direct.createNewFile();
			FileWriter fw = new FileWriter(direct);
			ArrayList<String> temp = getList(dir);
			for (int i = 0; i < temp.size(); i++) {
				fw.write(temp.get(i) + System.getProperty( "line.separator" ));
			}
			fw.flush();
			fw.close();
		} else {
			FileReader fr = new FileReader(direct);
			Scanner scan1 = new Scanner(fr);
			ArrayList<String> list = new ArrayList<String>();
			while (scan1.hasNextLine()) {
				list.add(scan1.nextLine());
			}
			scan1.close();
			list.addAll(getList(dir));
			FileWriter fw1 = new FileWriter(direct);
			for (int i = 0; i < list.size(); i++) {
				fw1.write(list.get(i) + System.getProperty( "line.separator" ));
			}
			fw1.flush();
			fw1.close();
			
		}

	}
	
	public static ArrayList<String> getList(String dir) {
		ArrayList<File> files = new ArrayList<>();
		int slashCount = 0;
		for (int i = 0; i < dir.length(); i++) {
			if (dir.charAt(i) == '\\') {
				slashCount++;
			}
		}

		while (slashCount > 0) {
			File[] tempFiles = new File(dir).listFiles();
			for (int i = 0; i < tempFiles.length; i++) {	
				files.add(tempFiles[i]);	
			}
			
			int slashIndex = 0;
			for (int j = dir.length() - 1; j >= 0; j--) {
				if (dir.charAt(j) == '\\') {
					slashIndex = j;
					break;
				}
			}
			dir = dir.substring(0, slashIndex);
			slashCount--;	
			}
		ArrayList<String> fileString = new ArrayList<>();
		for (int i = 0; i < files.size(); i++) {
			fileString.add(files.get(i).getName());	
		}
		return fileString;
	}
}
