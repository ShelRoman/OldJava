package week6.lesson12;

import java.util.ArrayList;

public class HundredThreadMain {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<HundredThread> threads = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			threads.add(new HundredThread("Thread # " + i));
		}
		for (HundredThread thread : threads) {
			thread.start();
		}
		Thread.sleep(10000);
		for (HundredThread thread : threads) {
			thread.interrupt();
		}
		
	}

}
