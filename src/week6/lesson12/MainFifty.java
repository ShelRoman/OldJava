package week6.lesson12;

public class MainFifty {

	public static void main(String[] args) throws InterruptedException {
		FiftyThread thread1 = new FiftyThread();
		thread1.start();
		
		Thread.sleep(3000);
		
		for (HundredThread thread :thread1.threads ) {
			thread.interrupt();
		}
		System.out.println("Little threads done");
		
		Thread.sleep(3000);
		
		thread1.interrupt();
		
	}

}
