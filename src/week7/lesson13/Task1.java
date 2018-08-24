//Task 1. �������� ����� ����������� ��� �����, � ������� ���������� ����� ����� ������� � ������. 
//������� � ������� ����� �� �����, ����������� � ��� ����.
//FileInputStream.
//
//Task 2. ��������� � ������������ �����. ���������� ��� ����� �����, ������� ����� ��� �� �����.
//(InputStreamReader � BufferedReader, ��� Scanner)

package week7.lesson13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("temp.out");
		int number;
		int len = is.available();
		byte[] buf = new byte[len];
		number = is.read(buf);
		String num = "";
		int numb;
		for (byte b : buf) {
			if ((b != 32) && (b != 10) && (b != 13)) {
				char x = (char) b;
				int xx = ((int) x - 48);
				num = "" + num + xx;
			} else if (b == 32) {
				numb = Integer.parseInt(num.substring(0));
				System.out.print(numb * 2);
				num = "";
				System.out.print((char) b);
			} else if (b == 10) {
				System.out.print((char) b);
			} else if (b == 13) {
				numb = Integer.parseInt(num.substring(0));
				System.out.print(numb * 2);
				num = "";
				System.out.print((char) b);
			}
		}
		numb = Integer.parseInt(num.substring(0));
		System.out.print(numb * 2);
		num = "";
	}
}