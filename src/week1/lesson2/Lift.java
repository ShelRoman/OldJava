/*Task 7. Lift MainLift.
Будем считать, что все люди в дом попадают только через лифт, убывают тем же способом.
Поля объекта Lift  не менять напрямую.(только через метод)
На первом этаже тех этаж(тут люди не живут).
Поля: 
 - текущий этаж
 - общее количество этажей перемещения
 - общее количество перевезенных людей
 - количество людей находящихся в данный момент в доме.
У лифта методы: 
    - метод перемещения лифта с номером этажа для перемещения nextFloor и 
    количеством человек countHuman: move(int nextFloor, int countHuman)
 - метод выводящий состояние лифта(значение всех полей объекта):printAboutMe()
В главном классе создать объект лифта, и вызвать 10 раз метод move (с рандомными значениями) и после каждого перемещения
 вызываем метод printAboutMe. */
package week1.lesson2;

import java.util.ArrayList;

public class Lift {
	int currentFloor = 1;
	int peopleUsedLift;
	int peopleInBuilding;
	ArrayList<Integer> floors = new ArrayList<Integer>();

	public void printAboutMe() {
		System.out.println("The lift is on the " + currentFloor + " floor");
		System.out.println("Total floors the lift had visited is - "
				+ floors.size());
		System.out.println("Total people that used lift is " + peopleUsedLift);
		System.out.println("Total people in building is " + peopleInBuilding
				+ " people");
	}

	public void move(int nextFloor, int countHuman) {
		if (currentFloor == nextFloor) {
			System.out.println("Lift is already on this floor");
		} else if (nextFloor < 1) {
			System.out.println("Wrong floor, please select another");
		} else {
			peopleUsedLift += countHuman;
			peopleInBuilding += countHuman;
			floors.add(nextFloor);
			currentFloor = nextFloor;
			if (floors.size() > 2) {
				int removeIndex = 0;
				int removeCount = 0;
				for (int i = 0; i < floors.size(); i++) {
					if (floors.get(i) == nextFloor) {
						removeCount++;
						removeIndex = i;
					}
				}
				if (removeCount > 1) {
					floors.remove(removeIndex);
				}
			}
			if (nextFloor == 1) {
				peopleInBuilding -= countHuman;
			}
			
		}

	}

	public static void main(String[] args) {

	}

}
//done