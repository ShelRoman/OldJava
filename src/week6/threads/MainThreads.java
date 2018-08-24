/*Task4. Написать код для заполнения ArrayList и Vector 10000 элементами 
числами от (1, 2, 3, 4, ..., 999, 10000).Заполнять отдельными потоками,
каждый поток заполняет только по 1000 элементов.
 Посчитать скорость заполнения для ArrayList и для Vector.

Task5. Написать код для многопоточного подсчета суммы элементов набора 
Vector и ArrayList из целых чисел. Каждый поток может считать 
 только 1000 элементов. 
 Посчитать скорость выполнения для ArrayList и для Vector.

Task 6. Создать класс Product(name, code,price, kol, date), Shop(ArrayList<Product>).
Добавить в магазин 10000 продуктов со случайными значениями полей.
Написать методы:
 1) Реализовать метод двоичного поиска товара по коду
 2) Подсчет суммы всех товаров(price*kol) с помощью создания 10 потоков, каждый из которых считает по 1000 элементов в списке
 3) Реализовать метод сортировки товаров в магазине по коду
 4) Реализовать метод сортировки товаров в магазине по дате закупки
 5) Реализовать метод двоичного поиска товара по дате закупки
 6) Создать два исключения: NullProductByDateException и NullProductByCodeException
*/
package week6.threads;

import java.util.ArrayList;

public class MainThreads {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		FillThread fillAr0 = new FillThread();
		FillThread fillAr1 = new FillThread();
		FillThread fillAr2 = new FillThread();
		FillThread fillAr3 = new FillThread();
		FillThread fillAr4 = new FillThread();
		FillThread fillAr5 = new FillThread();
		FillThread fillAr6 = new FillThread();
		FillThread fillAr7 = new FillThread();
		FillThread fillAr8 = new FillThread();
		FillThread fillAr9 = new FillThread();
		
		long time1 = System.nanoTime();
		fillAr0.start();
		fillAr1.start();
		fillAr2.start();
		fillAr3.start();
		fillAr4.start();
		fillAr5.start();
		fillAr6.start();
		fillAr7.start();
		fillAr8.start();
		fillAr9.start();
		
		fillAr0.fillArray(array, 1, 1000);
		fillAr1.fillArray(array, 1001, 2000);
		fillAr2.fillArray(array, 2001, 3000);
		fillAr3.fillArray(array, 3001, 4000);
		fillAr4.fillArray(array, 4001, 5000);
		fillAr5.fillArray(array, 5001, 6000);
		fillAr6.fillArray(array, 6001, 7000);
		fillAr7.fillArray(array, 7001, 8000);
		fillAr8.fillArray(array, 8001, 9000);
		fillAr9.fillArray(array, 9001, 10000);
		
		fillAr0.interrupt();
		fillAr1.interrupt();
		fillAr2.interrupt();
		fillAr3.interrupt();
		fillAr4.interrupt();
		fillAr5.interrupt();
		fillAr6.interrupt();
		fillAr7.interrupt();
		fillAr8.interrupt();
		fillAr9.interrupt();
		long time2 = System.nanoTime();
		
		int[] vector = new int[10000];
		FillThread fillV0 = new FillThread();
		FillThread fillV1 = new FillThread();
		FillThread fillV2 = new FillThread();
		FillThread fillV3 = new FillThread();
		FillThread fillV4 = new FillThread();
		FillThread fillV5 = new FillThread();
		FillThread fillV6 = new FillThread();
		FillThread fillV7 = new FillThread();
		FillThread fillV8 = new FillThread();
		FillThread fillV9 = new FillThread();
		
		long time3 = System.nanoTime();
		fillV0.start();
		fillV1.start();
		fillV2.start();
		fillV3.start();
		fillV4.start();
		fillV5.start();
		fillV6.start();
		fillV7.start();
		fillV8.start();
		fillV9.start();
		
		fillV0.fillVector(vector, 1, 1000);
		fillV1.fillVector(vector, 1001, 2000);
		fillV2.fillVector(vector, 2001, 3000);
		fillV3.fillVector(vector, 3001, 4000);
		fillV4.fillVector(vector, 4001, 5000);
		fillV5.fillVector(vector, 5001, 6000);
		fillV6.fillVector(vector, 6001, 7000);
		fillV7.fillVector(vector, 7001, 8000);
		fillV8.fillVector(vector, 8001, 9000);
		fillV9.fillVector(vector, 9001, 10000);
		
		fillV0.interrupt();
		fillV1.interrupt();
		fillV2.interrupt();
		fillV3.interrupt();
		fillV4.interrupt();
		fillV5.interrupt();
		fillV6.interrupt();
		fillV7.interrupt();
		fillV8.interrupt();
		fillV9.interrupt();
		long time4 = System.nanoTime();
		long scoreArray = time2 - time1;
		long scoreVector = time4 - time3;
		System.out.println(scoreArray);
		System.out.println(scoreVector);
	}

}
