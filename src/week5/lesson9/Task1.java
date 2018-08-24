package week5.lesson9;

public class Task1 {

	public static void main(String[] args) {
		int[] array = new int[10000];
		int[] array1 = new int[10000];
		fillList(array);
		long time1 = System.nanoTime();
		bubbleSort(array);
		long time2 = System.nanoTime();
		long score1 = time2 - time1;
		fillList(array1);
		long time3 = System.nanoTime();
		sortBySample(array1);
		long time4 = System.nanoTime();
		long score2 = time4 - time3;
		System.out.println(score1);
		System.out.println(score2);
	}

	public static void bubbleSort(int[] array) {
		int operCount = 0;
		int temp;
		while (operCount >= 0) {
			operCount = -1;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					operCount++;
				}
			}

		}
	}

	public static void sortBySample(int[] array) {
		int loops = 0;
		int temp = 0;
		while (loops < array.length) {
			int min = array[loops];
			for (int i = loops; i < array.length; i++) {
				if (min > array[i]) {
					temp = min;
					min = array[i];
					array[i] = temp;
				}
			}
			array[loops] = min;
			loops++;
		}
	}

	public static void printList(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1] + "]");
	}

	public static void fillList(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((int) 100 * Math.random());
		}
	}
}
