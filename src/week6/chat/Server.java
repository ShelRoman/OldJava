//����� ������: 
// - ����� � ���� ������ �����. 
// - ������ 2 ������� ��������� ������� ������������ ����� � ���� "�����" ����� � ����������� ".cht"
// - ��� ���������� "������" ����� ��������� � ������ ����� ������.
// - ����� ������������, ���� ����� "����� ����", �� ������� ���� ������ �� �����.

package week6.chat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Server extends Thread {
	ArrayList<Line> lines = new ArrayList<>();

	public void run() {
		int primeSize = lines.size();
		while (!isInterrupted()) {
			File[] linesArray = new File("D:/Java/Chat").listFiles();
			if (linesArray.length != 0) {
				for (File line : linesArray) {
					try {
						FileInputStream fis = new FileInputStream(line);
						ObjectInputStream oin = new ObjectInputStream(fis);
						lines.add((Line) oin.readObject());
						fis.close();
						oin.close();
						line.delete();
						int newSize = lines.size();
						if (newSize > primeSize) {
							System.out.println("***********");
							for (Line line1 : lines) {
								System.out.println(line1.line);
							}
							System.out.println("***********");
							primeSize = newSize;
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
