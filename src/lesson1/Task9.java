package lesson1;
import java.util.Scanner;
public class Task9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите дробное число:");
		double res = scan.nextDouble();
		if (res % 1 != 0) {
			int overRes = (int) (res + 0.5);
			System.out.println(overRes);
		} else {
			System.out.println("Вы ввели не дробное число!!!");
		}
		

	}

}
