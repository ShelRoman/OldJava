package lesson2;

/*Пользователь вводит три числа, вывести на экран большее и меньшее из них в строчку.*/
import java.util.Scanner;

public class Hw_more_less {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите 3 числа:");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();

		if (k1 == k2 && k2 == k3)
			System.out.println("Все числа равны");
		else if (k1 > k2 && k2 >= k3)
			System.out.print(k1 + " " + k2);
		else if (k1 >= k2 && k2 >= k3)
			System.out.print(k1 + " " + k3);
		else if (k2 >= k3 && k3 >= k1)
			System.out.print(k2 + " " + k1);
		else if (k2 >= k1 && k1 >= k3)
			System.out.print(k2 + " " + k3);
		else if (k3 >= k2 && k2 >= k1)
			System.out.print(k3 + " " + k1);
		else if (k3 >= k1 && k1 >= k2)
			System.out.print(k3 + " " + k2);

	}
}
// done