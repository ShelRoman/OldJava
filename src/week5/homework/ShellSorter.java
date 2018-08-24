package week5.homework;

public class ShellSorter {

	public void sortShell(int[] vector) {
		int i;
		int step = vector.length / 2;
		while (step > 0) {
			for (int j = 0; j < vector.length - step; j++) {
				i = j;
				while (i >= 0 && vector[i] > vector[i + step]) {
					System.out.println(i + " " + (i + step));
					int temp = vector[i];
					vector[i] = vector[i + step];
					vector[i + step] = temp;
					i = i - step;
				}
			}
			step = step / 2;
		}
	}
}
