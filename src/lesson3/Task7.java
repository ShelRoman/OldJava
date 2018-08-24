/*Нарисовать прямоугольник из звездочек.Внутри звездочки.
 "*". Ширину и высоту задать с клавиатуры.*/
package lesson3;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите ширину");
		int width = scan.nextInt();
		System.out.println("Введите высоту");
		int height = scan.nextInt();
		drawRectangle(height, width);

	}

	public static void drawRectangle(int height, int width) {
		if (width > 0 && height > 0) {
			for (int t = 0; t < height; t++) {
				for (int i = 0; i < width; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (width < 1) {
			System.out.println("Неверное значение ширины");
		} else if (height < 1) {
				System.out.println("Неверное значение высоты");
		}
	}

}
// done