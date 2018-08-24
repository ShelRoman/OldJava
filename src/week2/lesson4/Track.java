/*2) Создать класс Track()(String number;)
Методы:
 roll() - начать катиться( не должен повторно катиться, если уже катится)
 stop() - остановить качение( не должен повторно остановиться, если уже остановлено) 
В мейне: 
 - создать два объекта прицепов
 - оба катим, 
 - первый пытаемся катить еще раз
 - все прицепы останавливаем
 - второй опять останавливаем */

package week2.lesson4;

public class Track {
	private String number;
	private boolean state;
	private Car car;
	private AutoSalon autoSalon;
	
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

	public void roll() {
		if (state) {
			System.out.println("Прицеп номер " + number + " уже катится");
		} else {
			state = true;
			System.out.println("Прицеп номер " + number + " покатился");
		}
	}

	public void stop() {
		if (!state) {
			System.out.println("Прицеп номер " + number + " и так стоит");
		} else {
			state = false;
			System.out.println("Прицеп номер " + number + " остановился");
		}
	}

	public void printAboutMe() {
		System.out.println("Прицеп с номером " + this.getNumber() + " состояние следующее:");
		if (this.car != null) {
			System.out.println("закреплен к авто номер " + this.getCar().getNumber());
			if (state) {
				System.out.println("Катитится вместе с авто");
			} else {
				System.out.println("Стоит вместе с авто");
			}
		} else {
			System.out.println("Не прикреплен к авто, стоит тихонько в гараже");
		}
		System.out.println("--------------------------------");
	}

	public Track(String number) {
		this.number = number;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
// done