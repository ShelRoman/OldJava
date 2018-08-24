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
		System.out.println("���� ����� " + number + " ��������� ���������: ");
		System.out.println("���� = " + this.getColor());
		if (stateOfEngine) {
			System.out.println("��������� ��������");
			if (stateOfMotion) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� �����");
			}
		} else {
			System.out.println("��������� �������� � ���� ����� �� �����");
		}
		System.out.println("--------------------------------");
	}

	public void rePaint(String newColor) {
		color = newColor;
	}

	public void start() {
		if (!stateOfEngine) {
			stateOfEngine = true;
			System.out.println("���� ����� " + number + " ��������");
		} else {
			System.out.println("��������� ���� ����� " + number + " ��� �������, ��� ������������� � ��������� ������� ���������");
		}
	}

	public void move() {
		if (!stateOfMotion & stateOfEngine) {
			stateOfMotion = true;
			System.out.println("���� ����� " + number + " �������");
		} else if (stateOfMotion) {
			System.out.println("���� ����� " + number + " � ��� ��������� � ��������");
		} else {
			System.out.println("���� ����� " + number + " ��� ������ �������� ���������� ������� ���������");
		}
	}

	public void stop() {
		if (stateOfMotion & stateOfEngine) {
			stateOfMotion = false;
			stateOfEngine = false;
			System.out.println("���� ����� " + number + " ������������ � ��������� ���������");
		} else if (!stateOfMotion & stateOfEngine) {
			stateOfEngine = false;
			System.out.println("���� ����� " + number + " ��������� ���������");
		} else {
			System.out.println("���� ����� " + number + " � ��� ����� � ��������� ��������");
		}
	}
}
// done