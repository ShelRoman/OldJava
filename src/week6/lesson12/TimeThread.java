//Task 1. ������� �����, ������� ����� ������ 10 ������ �������� ������� ����� �� �����. 
//������� ����������� ���������� ������ � ������� ������� � �������.

package week6.lesson12;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TimeThread extends Thread {
	
	@Override
	public void run() {
		SimpleDateFormat date1 = new SimpleDateFormat("HH:mm:ss");
		while (true) {
			Calendar cal = Calendar.getInstance();
			System.out.println(date1.format(cal.getTime()));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				return;
			}
			
		}
		
	}
}


