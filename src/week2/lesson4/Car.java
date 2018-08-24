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
package week2.lesson4;

public class Car {
	private String number;
	private String color;
	private boolean stateOfEngine;
	private boolean stateOfMotion;
	private Track track;
	private AutoSalon autoSalon;

	public Car(String number, String color) {
		this.setNumber(number);
		this.setColor(color);
	}
	
	public void setAutoSalon(AutoSalon autoSalon) {
		this.autoSalon = autoSalon;
	}
	
	public AutoSalon getAutoSalon() {
		return this.autoSalon;
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

	public void setTrack(Track track) {
		if (this.track == null & track.getCar() == null) {
			this.track = track;
			track.setCar(this);
			System.out.println("Авто номер " + number + " присоединило прицеп с номером " + track.getNumber());
		} else if (this.track != null) {
			System.out.println("Авто номер " + number	+ " уже имеет прицеп с номером " + this.track.getNumber()
					+ " и не может прицепить еще один прицеп");
		} else {
			System.out.println("Авто номер " + number	+ " не может прикрепить прицеп " + track.getNumber() 
					+ " так как он привязан к машине " 	+ track.getCar().getNumber());
		}
	}

	public Track getTrack() {
		return this.track;
	}

	public void unSetTrack() {
		if (this.track == null) {
			System.out.println("Авто номер " + number + " не имеет прицепа");
		}
		System.out.println("Авто номер " + number + " отцепило прицеп номер " + this.getTrack().getNumber());
		this.getTrack().setCar(null);
		this.track = null;
	}

	public void printAboutMe() {
		System.out.println("Авто номер " + number + " состояние следующее: ");
		System.out.println("Цвет = " + this.getColor());
		if (this.getTrack() != null) {
			System.out.println("Прикреплен прицеп с номером " + this.getTrack().getNumber());
		} else {
			System.out.println("Прицеп не закреплен");
		}
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
			if (this.getTrack() != null) {
				this.getTrack().roll();
			}
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
			if (this.getTrack() != null) {
				this.getTrack().stop();
			}
		} else if (!stateOfMotion & stateOfEngine) {
			stateOfEngine = false;
			System.out.println("Авто номер " + number + " заглушило двигатель");
		} else {
			System.out.println("Авто номер " + number + " и так стоит и двигатель заглушен");
		}
	}
}
// done