/*Пользователь вводит высоту и ширину двумерного массива (матрицы). Заполнить матрицу случайными числами [0..9] и вывести на экран.
При вводе неверных размеров массива, выдавать сообщение "Не верный размер массива" и выходить из программы.
Перед вводом значений НЕ нужно пользователю выдавать сообщений, типа: "Введите ширину".
Пример:
3
4
1234
5678
9123 */

package week1.homework;

import java.util.Scanner;

public class Random_Matrix {

	public static void main(String[] args) {
		randomMatrix();
	}

	public static void randomMatrix() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int outter = 0;
		int inner = 0;
		if (scan.hasNextInt()) {
			outter = scan.nextInt();
			if (outter > 0) {
				if (scan.hasNextInt()) {
					inner = scan.nextInt();
					if (inner > 0) {
						int[][] array = new int[outter][inner];
						for (int i = 0; i < outter; i++) {
							for (int j = 0; j < inner; j++) {
								array[i][j] = (int) (9 * Math.random());
							}
						}
						for (int k = 0; k < outter; k++) {
							for (int t = 0; t < inner; t++) {
								System.out.print(array[k][t]);
							}
							System.out.println();
						}
					} else {
						System.out.println("Не верный размер массива");
					}
				} else {
					System.out.println("Не верный размер массива");
				}
			} else {
				System.out.println("Не верный размер массива");
			}
		} else {
			System.out.println("Не верный размер массива");
		}
	}
}
//done