//Task 1. Создать поток, который будет каждые 10 секунд выводить текущее время на экран. 
//Сделать возможность прерывания потока с помощью команды с консоли.

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


