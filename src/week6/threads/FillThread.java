package week6.threads;

import java.util.ArrayList;

public class FillThread extends Thread {
	
	@Override
	public void run(){
		while(!isInterrupted()) {
			
		}
	}
	
	public void fillArray(ArrayList<Integer> array, int start, int end) {
		for (int i = start; i <= end; i++) {
			array.add(i);
		}
	}
	
	public void fillVector(int[] vector, int start, int end) {
		for (int i = start; i <= end; i++) {
			vector[i - 1] = i;
		}
	}

}
