//Task 3. Создать поток, который создаст 50 потоков, каждый их которых выведет на экран свой номер и дождется,
//пока его прервут. Прерывание дочерних потоков должно выполнятся из потока их порождающего.

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
