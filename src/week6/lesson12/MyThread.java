package week6.lesson12;


public class MyThread extends Thread {
	String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 2000; i++) {
			System.out.println(name + ": " + i);
		}
	}
}