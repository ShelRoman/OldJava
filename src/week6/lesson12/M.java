package week6.lesson12;

public class M implements Runnable {
	String name;
	
	public M (String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 2000; i++) {
			System.out.println(name + ": " + i);
		}
	}


}
