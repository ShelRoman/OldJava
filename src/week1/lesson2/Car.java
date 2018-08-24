/* ƒополнить классы Car и MainCar. 
ћетоды: start,move() stop(). Ёти объекты вывод€т на экран сообщение:
авто с номером таким-то завелась/начала движение/остановилась(с выключением двигател€).
ƒл€ автомобил€ эти методы должны мен€ть состо€ние авто(заводим соответсвующе поле/пол€)
≈сли авто уже завелась, то выводит сообщение: 
  - авто такое-то не могу завестись так как уже заведена или 
  - авто такое-то не могу ехать так как уже еду
  и т.д.
јвтомобиль не может ехать если не заведен двигатель, не может остановитьс€ если не едет и так далее.
ѕродумать все ограничени€ и реализовать эти 3 метода с учетом состо€ни€ авто. */
package week1.lesson2;

public class Car {
	String number;
	String color;
	boolean stateOfEngine;
	boolean stateOfMotion;

	public void printAboutMe() {
		System.out.println(number + " " + color);
	}

	public void rePaint(String newColor) {
		color = newColor;
	}

	public void start() {
		if (stateOfEngine == false) {
			stateOfEngine = true;
			System.out.println("Ѕорт номер " + number + " завелс€");
		} else {
			System.out
					.println("ƒвигатель борта номер "
							+ number
							+ " уже заведен, нет необходимости в повторном запуске двигател€");
		}

	}

	public void move() {
		if (stateOfMotion == false && stateOfEngine == true) {
			stateOfMotion = true;
			System.out.println("Ѕорт номер " + number + " поехал");
		} else if (stateOfMotion == true) {
			System.out.println("Ѕорт номер " + number
					+ " и так находитс€ в движении");
		} else {
			System.out.println("Ѕорту номер " + number
					+ " дл€ начала движени€ необходимо завести двигатель");
		}

	}

	public void stop() {
		if (stateOfMotion == true && stateOfEngine == true) {
			stateOfMotion = false;
			stateOfEngine = false;
			System.out.println("Ѕорт номер " + number
					+ " остановилс€ и заглушил двигатель");
		} else if (stateOfMotion == false && stateOfEngine == true) {
			System.out.println("Ѕорт номер " + number + " заглушил двигатель");
		} else {
			System.out.println("Ѕорт номер " + number
					+ " и так стоит и двигатель заглушен");
		}

	}
	
}
// done