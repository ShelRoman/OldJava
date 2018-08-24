package lesson5;

public class Task3 {
	public static void main(String[] args) {
		int[][] vector = new int[4][4];
		fillVector(vector);
		printVector(vector);

	}

	public static void fillVector(int[][] vector) {
		int fillNum = 1;
		int lineIndex = 3;
		
		for (int i = 00; i < vector.length; i++) {
			if (((double)lineIndex / 2) - ((int) lineIndex / 2) != 0) {
				for (int j = 00; j < vector[i].length; j++) {
					vector[i][j] = fillNum;
					fillNum++;
				}
			} else {
				for (int j = vector[i].length - 1; j >= 0; j--) {
					vector[i][j] = fillNum;
					fillNum++;
				}
			}
			lineIndex++;
		}
	}

	public static void printVector(int[][] vector) {
		for (int i = 00; i < vector.length; i++) {
			System.out.println();
			for (int j = 00; j < vector[i].length - 1; j++) {
				System.out.print(vector[i][j] + ",");
			}
			System.out.print(vector[i][3]);
		}
	}
}
//done