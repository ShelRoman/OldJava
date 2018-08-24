//Task 3. ������� �����, ������� ������� 50 �������, ������ �� ������� ������� �� ����� ���� ����� � ��������,
//���� ��� �������. ���������� �������� ������� ������ ���������� �� ������ �� ������������.

package week6.lesson12;

import java.util.ArrayList;

public class FiftyThread extends Thread {
	String name;
	ArrayList<HundredThread> threads = new ArrayList<>();
	
	
	public void run() {
		for (int i = 0; i <= 50; i++) {
			this.threads.add(new HundredThread("Thread # " + i));
			
		}
		for (HundredThread thread: threads) {
			thread.start();
		}
		while (true) { 
			if (isInterrupted()) {
				return;
			}
		}
	}
}
