//Task 5. Написать метод, проверяющий, является ли строка числом. Воспользоваться Integer. valueOf( str ).
//Если строка не число, то метод должен кидать исключение NullPointerException.
//
//Task 6. Написать метод, проверяющий, существует ли файл с определенным именем.
//(Можно использовать FileReader Scanner).
//Если файла нет, то метод кидает исключение ArithmeticException.
//
//Task 7. Дописать к классу Продукт свои исключения: 
// - ошибка при попытке установить отрицательную цену 
// - ошибка при попытке установить прошлогодную дату

package week6.lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task5 {
	
	public static void main(String[] args) {
		
	}
	
	public static Exception isStringInt(String str) {
		try {
			System.out.println(Integer.valueOf(str));
		} catch (Exception e) {
			return null;
		} finally {
			System.out.println("done");
		}
		return null;
		
	}
	
	@SuppressWarnings("resource")
	public static Exception isFileExist(File file) {
		try {
			@SuppressWarnings("unused")
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			throw new ArithmeticException();
		}
		return null;
		
	}
}
