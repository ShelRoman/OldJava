//Task7*. јналогично, только внутри пробелы.
package lesson3;

import java.util.Scanner;

public class Task7a {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите ширину");
		int width = scan.nextInt();
		System.out.println("¬ведите высоту");
		int height = scan.nextInt();
		f(width, height);

	}

	public static void f(int width, int height) {
		for (int t = 0; t < height; t++) {
			if (t == 0 || t == height - 1) {
				for (int i = 0; i < width; i++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int i = 0; i < width - 2; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}
		}


}
// done