/* Дополнить классы Car и MainCar. 
Методы: start,move() stop(). Эти объекты выводят на экран сообщение:
авто с номером таким-то завелась/начала движение/остановилась(с выключением двигателя).
Для автомобиля эти методы должны менять состояние авто(заводим соответсвующе поле/поля)
Если авто уже завелась, то выводит сообщение: 
  - авто такое-то не могу завестись так как уже заведена или 
  - авто такое-то не могу ехать так как уже еду
  и т.д.
Автомобиль не может ехать если не заведен двигатель, не может остановиться если не едет и так далее.
Продумать все ограничения и реализовать эти 3 метода с учетом состояния авто. */
package week6.lesson11;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = 1L;
	private String number;
	private String color;
	private boolean stateOfEngine;
	private boolean stateOfMotion;

	public Car(String number, String color) {
		this.setNumber(number);
		this.setColor(color);
	}
		
	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void printAboutMe() {
		System.out.println("Авто номер " + number + " состояние следующее: ");
		System.out.println("Цвет = " + this.getColor());
		if (stateOfEngine) {
			System.out.println("Двигатель работает");
			if (stateOfMotion) {
				System.out.println("Авто едет");
			} else {
				System.out.println("Авто стоит");
			}
		} else {
			System.out.println("Двигатель выключен и авто стоит на месте");
		}
		System.out.println("--------------------------------");
	}

	public void rePaint(String newColor) {
		color = newColor;
	}

	public void start() {
		if (!stateOfEngine) {
			stateOfEngine = true;
			System.out.println("Авто номер " + number + " завелось");
		} else {
			System.out.println("Двигатель авто номер " + number + " уже заведен, нет необходимости в повторном запуске двигателя");
		}
	}

	public void move() {
		if (!stateOfMotion & stateOfEngine) {
			stateOfMotion = true;
			System.out.println("Авто номер " + number + " поехало");
		} else if (stateOfMotion) {
			System.out.println("Авто номер " + number + " и так находится в движении");
		} else {
			System.out.println("Авто номер " + number + " для начала движения необходимо завести двигатель");
		}
	}

	public void stop() {
		if (stateOfMotion & stateOfEngine) {
			stateOfMotion = false;
			stateOfEngine = false;
			System.out.println("Авто номер " + number + " остановилось и заглушило двигатель");
		} else if (!stateOfMotion & stateOfEngine) {
			stateOfEngine = false;
			System.out.println("Авто номер " + number + " заглушило двигатель");
		} else {
			System.out.println("Авто номер " + number + " и так стоит и двигатель заглушен");
		}
	}
}
// done