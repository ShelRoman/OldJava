//
//Task 2. ������� 100 �������, ������ �� ������� ������� �� ����� ���� ����� � ��������, ���� ��� �������.
package week6.lesson12;

public class HundredThread extends Thread {
	String name;
	
	public HundredThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name);
		while (!isInterrupted()) {
			if (isInterrupted()) {
				return;
			}
		}
		
	}
}
