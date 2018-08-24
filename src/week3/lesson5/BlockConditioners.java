/* Консольное меню:
1. Отобразить состояние всех кондиционеров
2. Включить кондиционер с индексом...
3. Выключить кондиционер с индексом...
4. Установить температуру для кондиционера с индексом...
5. Выход. */
package week3.lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class BlockConditioners {
	private ArrayList<Conditioner> conds = new ArrayList<>();

	public void addCond(Conditioner cond) {
		this.conds.add(cond);
	}

	
	private static String[] operationNames = {
			"1. Отобразить состояние всех кондиционеров",
			"2. Включить кондиционер с индексом",
			"3. Выключить кондиционер с индексом",
			"4. Установить температуру для кондиционера с индексом",
			"5. Выход." };

	@SuppressWarnings({ "resource" })
	public void start() {
		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			for (String m : operationNames) {
				System.out.println(m);
			}
			System.out.println("Выберите операцию:");
			int userChoice = scan.nextInt();
			switch (userChoice) {
			case 1:
				for (int i = 0; i < conds.size(); i++) {
					System.out.print("Conditioner № " + i + ": Standby - ");
					if (conds.get(i).getTurn()) {
						System.out.print("On");
					} else {
						System.out.print("Off");
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Enter index of conditioner to turn on");
				Scanner scan2 = new Scanner(System.in);
				int condOn = scan2.nextInt();
				conds.get(condOn).TurnOn();
				break;
			case 3:
				System.out.println("Enter index of conditioner to turn on");
				Scanner scan3 = new Scanner(System.in);
				int condOff = scan3.nextInt();
				conds.get(condOff).TurnOff();
				break;
			case 4:
				Scanner scan4 = new Scanner(System.in);
				System.out.println("Enter index of conditioner to set temperature");
				int setTemp = scan4.nextInt();
				System.out.println("Enter value of temperature to set");
				int intTemp = scan4.nextInt();
				conds.get(setTemp).setTemperature(intTemp);
				break;
			case 5:
				runWhile = false;
				System.out.println("Goodbye");
				break;
			}
		}
	}

}
