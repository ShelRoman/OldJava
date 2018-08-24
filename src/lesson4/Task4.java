/* Task4. Написать метод getMax, который принимает два целых числа и возвращает максимальное.
В main считать два целых числа и передать методу getMax. */
package lesson4;

import java.util.Scanner;

public class Task4 {

	public static int getMax(int a1, int b1){
		int res = 0;
		if (a1 > b1) {
			res = a1;
		}
		else if (b1 > a1) {
			res = b1;
		}
		else {
			System.out.println("Числа равны");
		}
		return res;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int a = scan.nextInt();
		System.out.println("Введите второе число:");
		int b = scan.nextInt();
		int max = getMax(a,b);
		System.out.println("Большее число "+ max);
	}

}
//done