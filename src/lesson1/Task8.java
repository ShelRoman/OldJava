package lesson1;
//import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		double money = 555; //double money = scan.nextDouble();
		double price = 22.33; // double price = scan.nextDouble();
		double quantity = money / price;
		double change = money - (price * (int)quantity);
		System.out.println("Вы купили " + (int)quantity + " ед. продукции и ваша сдача " + (float)change + " грн.");
		}
	}

