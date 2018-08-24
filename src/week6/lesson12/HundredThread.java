//
//Task 2. Создать 100 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут.
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
