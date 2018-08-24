/* Создать массив из n елементов. Заполнить массив числами: посередине 0, затем вправо и влево увеличиваем на 1. 
 Если количестов элементов четное, то внутри должно быть 2 нуля.
Вывести массив на экран. Пример: 5,4,3,2,1,0,1,2,3,4,5*/
package lesson3;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите размер массива");
		int n = scan.nextInt();
		int[] vector = new int[n];
		
		if (((double)vector.length / 2) - ((int)vector.length / 2) != 0 ) {
			vector[vector.length / 2] = 0;
			for(int i = (vector.length / 2 + 1); i < vector.length; i++) {
				for(int j = i + 1; j < vector.length; j++) {
					vector[j] ++;
				}
				vector[i] ++;
			}
			for(int i = (vector.length / 2 -1); i >= vector[0]; i--) {
				for(int j = i - 1; j >= vector[0]; j--) {
					vector[j] ++;
				}
				vector[i] ++;
			}
		}
		
		else {
			vector[vector.length / 2] = 0;
			vector[vector.length / 2 - 1] = 0;
			for(int i = (vector.length / 2 + 1); i < vector.length; i++) {
				for(int j = i + 1; j < vector.length; j++) {
					vector[j] ++;
				}
				vector[i] ++;
			}
			for(int i = (vector.length / 2 - 2); i >= vector[0]; i--) {
				for(int j = i - 1; j >= vector[0]; j--) {
					vector[j] ++;
				}
				vector[i] ++;
			}
		}
		vector[0] = vector[1] + 1;
		for(int i = 0; i < vector.length; i++){
			System.out.print(vector[i] + ", ");
		}
	}

}
//done