/*2) ������� ����� Track()(String number;)
������:
 roll() - ������ ��������( �� ������ �������� ��������, ���� ��� �������)
 stop() - ���������� �������( �� ������ �������� ������������, ���� ��� �����������) 
� �����: 
 - ������� ��� ������� ��������
 - ��� �����, 
 - ������ �������� ������ ��� ���
 - ��� ������� �������������
 - ������ ����� ������������� */

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
			System.out.println("������ ����� " + number + " ��� �������");
		} else {
			state = true;
			System.out.println("������ ����� " + number + " ���������");
		}
	}

	public void stop() {
		if (!state) {
			System.out.println("������ ����� " + number + " � ��� �����");
		} else {
			state = false;
			System.out.println("������ ����� " + number + " �����������");
		}
	}

	public void printAboutMe() {
		System.out.println("������ � ������� " + this.getNumber() + " ��������� ���������:");
		if (this.car != null) {
			System.out.println("��������� � ���� ����� " + this.getCar().getNumber());
			if (state) {
				System.out.println("��������� ������ � ����");
			} else {
				System.out.println("����� ������ � ����");
			}
		} else {
			System.out.println("�� ���������� � ����, ����� �������� � ������");
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