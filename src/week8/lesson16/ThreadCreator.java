package week8.lesson16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ThreadCreator extends Thread {
	File file;
	public ThreadCreator(File file) {
		this.file = file;
	}
	
	@Override
	public void run() {
		while(!isInterrupted()) {
			
		}
	}
	
	public void writeIn(String line) throws IOException {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(line);
		oos.close();
		fos.close();
		oos.flush();
		fos.flush();
	}
}
