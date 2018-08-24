//Task 4. ���������� ��� � �������������. � ������� ������ ��������� ������ � ������.
//������� ���������� �����, ���� ����� ������������ ����� ��������.
//����� ������:
// - � ������� ��������� ������
// - ���������� ������ ����������� � ��������� ���� � ������������ ������ � ����������� ".cht".

package week6.chat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Client extends Thread {

	@SuppressWarnings("resource")
	@Override
	public void run() {
		int nameNum = 1;
		while (!isInterrupted()) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Type:");
			Line line = new Line(scan.nextLine());
			if (line.line.equals("quit")) {
				this.interrupt();
				break;
			}
			try {
				FileOutputStream fos = new FileOutputStream("D:/Java/Chat/" + "line" + nameNum + ".cht");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(line);
				oos.close();
				fos.close();
				oos.flush();
				fos.flush();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			nameNum++;
		}
	}

}
