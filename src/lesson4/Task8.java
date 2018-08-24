/*Task8. Написать метод, который принимает число k, создает массив из k элементов, 
 заполняет числами от 10 до ... с шагом 2 (увеличивая) и возвращает массив.
  В main объявить переменную типа массив и присвоить ей вызов этого метода.
  Добавить в задачу метод вывода массива на экран. */
package lesson4;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число");
		int k = scan.nextInt();
		int[] vectRes = createVector(k);
		printVector(vectRes);
	}
	
	public static int[] createVector(int k) {
		int[] vect = new int [k];
		int fillNum = 10;		
		for(int i = 0; i < vect.length; i++){
			vect[i] = fillNum;
			fillNum += 2;
		}
		return vect;
	}

	public static void printVector(int[] vect) {
		for(int i = 0; i < vect.length; i++){
			System.out.print(vect[i] + ", ");
	    }
		System.out.println();
	}

}
//done
