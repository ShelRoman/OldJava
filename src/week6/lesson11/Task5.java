//Task 5. �������� �����, �����������, �������� �� ������ ������. ��������������� Integer. valueOf( str ).
//���� ������ �� �����, �� ����� ������ ������ ���������� NullPointerException.
//
//Task 6. �������� �����, �����������, ���������� �� ���� � ������������ ������.
//(����� ������������ FileReader Scanner).
//���� ����� ���, �� ����� ������ ���������� ArithmeticException.
//
//Task 7. �������� � ������ ������� ���� ����������: 
// - ������ ��� ������� ���������� ������������� ���� 
// - ������ ��� ������� ���������� ������������ ����

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
