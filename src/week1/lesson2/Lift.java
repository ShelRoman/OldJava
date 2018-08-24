/*Task 7. Lift MainLift.
����� �������, ��� ��� ���� � ��� �������� ������ ����� ����, ������� ��� �� ��������.
���� ������� Lift  �� ������ ��������.(������ ����� �����)
�� ������ ����� ��� ����(��� ���� �� �����).
����: 
 - ������� ����
 - ����� ���������� ������ �����������
 - ����� ���������� ������������ �����
 - ���������� ����� ����������� � ������ ������ � ����.
� ����� ������: 
    - ����� ����������� ����� � ������� ����� ��� ����������� nextFloor � 
    ����������� ������� countHuman: move(int nextFloor, int countHuman)
 - ����� ��������� ��������� �����(�������� ���� ����� �������):printAboutMe()
� ������� ������ ������� ������ �����, � ������� 10 ��� ����� move (� ���������� ����������) � ����� ������� �����������
 �������� ����� printAboutMe. */
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