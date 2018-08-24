/* Task2. Написать метод, принимающий двухмерный квадратный массив и заполняющий:
 01,02,03,04
 05,06,07,08
 09,10,11,12
 13,14,15,16 */
package lesson5;

public class Task2 {
	public static void main(String[] args) {
		int[][] vector = new int[4][4];
		fillVector(vector);
		printVector(vector);

	}

	public static void fillVector(int[][] vector) {
		int b = 1;
		for (int i = 00; i < vector.length; i++) {
			for (int j = 00; j < vector[i].length; j++) {
				vector[i][j] = b;
				b++;
			}
		}
	}

	public static void printVector(int[][] vector) {
		for (int i = 00; i < vector.length; i++) {
			System.out.println();
			for (int j = 00; j < vector[i].length-1; j++) {
				System.out.print(vector[i][j] + ", ");
			}
			System.out.print(vector[i][3]);
		}
	}
}
//done