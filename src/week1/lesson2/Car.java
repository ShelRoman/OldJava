/* ��������� ������ Car � MainCar. 
������: start,move() stop(). ��� ������� ������� �� ����� ���������:
���� � ������� �����-�� ��������/������ ��������/������������(� ����������� ���������).
��� ���������� ��� ������ ������ ������ ��������� ����(������� ������������� ����/����)
���� ���� ��� ��������, �� ������� ���������: 
  - ���� �����-�� �� ���� ��������� ��� ��� ��� �������� ��� 
  - ���� �����-�� �� ���� ����� ��� ��� ��� ���
  � �.�.
���������� �� ����� ����� ���� �� ������� ���������, �� ����� ������������ ���� �� ���� � ��� �����.
��������� ��� ����������� � ����������� ��� 3 ������ � ������ ��������� ����. */
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
			System.out.println("���� ����� " + number + " �������");
		} else {
			System.out
					.println("��������� ����� ����� "
							+ number
							+ " ��� �������, ��� ������������� � ��������� ������� ���������");
		}

	}

	public void move() {
		if (stateOfMotion == false && stateOfEngine == true) {
			stateOfMotion = true;
			System.out.println("���� ����� " + number + " ������");
		} else if (stateOfMotion == true) {
			System.out.println("���� ����� " + number
					+ " � ��� ��������� � ��������");
		} else {
			System.out.println("����� ����� " + number
					+ " ��� ������ �������� ���������� ������� ���������");
		}

	}

	public void stop() {
		if (stateOfMotion == true && stateOfEngine == true) {
			stateOfMotion = false;
			stateOfEngine = false;
			System.out.println("���� ����� " + number
					+ " ����������� � �������� ���������");
		} else if (stateOfMotion == false && stateOfEngine == true) {
			System.out.println("���� ����� " + number + " �������� ���������");
		} else {
			System.out.println("���� ����� " + number
					+ " � ��� ����� � ��������� ��������");
		}

	}
	
}
// done