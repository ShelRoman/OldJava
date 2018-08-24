package week6.lesson12;

import java.util.Scanner;

public class MainThread {
	
	public static void main(String[] args) {
		TimeThread thread1 = new TimeThread();
		Scanner scan = new Scanner(System.in);
		thread1.start();
		String end = scan.nextLine();
		if (end.equals("end")) {
			thread1.interrupt();
			System.out.println("Gotcha");
		}
		scan.close();
	}
}
