package week5.homework;

public class SortInsertion {
	public static void sortInsertion(int[] vector) {
		for (int i = 1; i < vector.length; i++) {
			int temp = vector[i];
			int j = i;
			while (j > 0 && temp < vector[j - 1]) {
				System.out.println(j - 1 + " " + j);
				vector[j] = vector[j - 1];
				j--;
			}
			vector[j] = temp;
		}
	}
}
