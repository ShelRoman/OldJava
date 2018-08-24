/*Task12. Создать массив из n елементов. С заполнением последовательностью m, m-2, m-4  и так далее. 
Вывести массив на экран. С консоли считать n и m.*/
package lesson3;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите размер массива");
		int n = scan.nextInt();
		System.out.println("Введите число m");
		int m = scan.nextInt();
		int[] vector = new int[n];
		
		for(int i = 0; i < vector.length; i++) {
			vector[i] = m;
			m = m -2;
		}
		
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i] + ", ");
		}
	}
}
//done