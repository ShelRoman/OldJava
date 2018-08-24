package week6.threads;

import java.util.ArrayList;

public class CountThread extends Thread {
	@Override
	public void run() {
		while (!isInterrupted()) {

		}
	}

	public int countArray(ArrayList<Integer> array, int start, int end) {
		int result = 0;
		for (int i = start; i <= end; i++) {
			result += i;
		}
		return result;
	}

	public int countVector(int[] vector, int start, int end) {
		int result = 0;
		for (int i = start; i <= end; i++) {
			result += vector[i - 1];
		}
		return result;
	}

}
