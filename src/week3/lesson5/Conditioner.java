/*
 * Task. Написать класс BlockConditioners, Conditioner и MainConditioners.
Класс BlockConditioners-это набор кондишнов.
В блоке управления 10 кондиционеров.
Делегирование.
Класс Conditioner: int temperature, setTemperature(int k), turnOn(),turnOff(), getTemperature(),?? getTurn()
Класс MainConditioner: консольное меню, где вызываются только методы объекта  BlockConditioners.  

 */
package week3.lesson5;

public class Conditioner {
	private int temperature;
	private boolean standby;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		if (standby) {
			this.temperature = temperature;
			System.out.println("Condtioner temperature set to: " + temperature + " degrees");
		} else {
			System.out.println("Turn on conditioner first");
		}
		
	}

	public void TurnOn() {
		if (!standby) {
			standby = true;
		} else {
			System.out.println("Condtioner is already on");
		}
	}

	public void TurnOff() {
		if (standby) {
			standby = false;
		} else {
			System.out.println("Condtioner is already off");
		}
	}
	
	public boolean getTurn() {
		return standby;
	}
}
