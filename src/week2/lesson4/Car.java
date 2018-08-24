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
			System.out.println("���� ����� " + number + " ������������ ������ � ������� " + track.getNumber());
		} else if (this.track != null) {
			System.out.println("���� ����� " + number	+ " ��� ����� ������ � ������� " + this.track.getNumber()
					+ " � �� ����� ��������� ��� ���� ������");
		} else {
			System.out.println("���� ����� " + number	+ " �� ����� ���������� ������ " + track.getNumber() 
					+ " ��� ��� �� �������� � ������ " 	+ track.getCar().getNumber());
		}
	}

	public Track getTrack() {
		return this.track;
	}

	public void unSetTrack() {
		if (this.track == null) {
			System.out.println("���� ����� " + number + " �� ����� �������");
		}
		System.out.println("���� ����� " + number + " �������� ������ ����� " + this.getTrack().getNumber());
		this.getTrack().setCar(null);
		this.track = null;
	}

	public void printAboutMe() {
		System.out.println("���� ����� " + number + " ��������� ���������: ");
		System.out.println("���� = " + this.getColor());
		if (this.getTrack() != null) {
			System.out.println("���������� ������ � ������� " + this.getTrack().getNumber());
		} else {
			System.out.println("������ �� ���������");
		}
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
			if (this.getTrack() != null) {
				this.getTrack().roll();
			}
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
			if (this.getTrack() != null) {
				this.getTrack().stop();
			}
		} else if (!stateOfMotion & stateOfEngine) {
			stateOfEngine = false;
			System.out.println("���� ����� " + number + " ��������� ���������");
		} else {
			System.out.println("���� ����� " + number + " � ��� ����� � ��������� ��������");
		}
	}
}
// done