package week2.lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalon {

	private ArrayList<Car> cars = new ArrayList<>();
	private ArrayList<Track> tracks = new ArrayList<>();
	private String[] menuList = {"1. �������� ����� ����������",
			"2. �������� ����� ������",
			"3. ��������� � ���� ������", //(������ �������� ���� � ��������)
			"4. ��������� �� ���� ������", //(������ ������� ����).
			"5. ���������� ������ ����.", 
			"6. ���������� ������ ��������.",
			"7. ���������� ����������� ���� �� ���������.",
			"8. ������� ����� start ��� ����", //(������ ������� ����).
			"9. ������� ����� move ��� ����", //(������ ������� ����).
			"10. ������� ����� stop ��� ����", //(������ ������� ����).
			"11. ���������� ������ ���� ���� � �������� � ������������� � ����������� ���� � ��������.",
			"12. �����"
	};
	
	public AutoSalon() {
		this.tracks.add(null);
		this.cars.add(null);
	}
	
	public void start() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			for (String i : menuList) {
				System.out.println(i);
			}
			System.out.println("�������� ��������:");
			int userChoice = scan.nextInt();
			switch (userChoice) {
				case 1:
					Scanner scan1 = new Scanner(System.in);
					System.out.println("������� ����� ����");
					String carNumber = scan1.nextLine();
					System.out.println("������� ���� ����");
					String carColor = scan1.nextLine();
					this.addCar(new Car(carNumber, carColor));
					System.out.println("���� ������� � ��������� � ����");
					System.out.println("--------------------------------");
					break;						
				case 2:
					Scanner scan2 = new Scanner(System.in);
					System.out.println("������� ����� �������");
					String trackNumber = scan2.nextLine();
					this.addTrack(new Track(trackNumber));
					System.out.println("������ ������ � �������� � ����");
					System.out.println("--------------------------------");
					break;
				case 3:
					Scanner scan3 = new Scanner(System.in);
					System.out.println("������� ������ ���� �� ������");
					int carIndex = scan3.nextInt();
					System.out.println("������� ������ ������� �� ������");
					int trackIndex = scan3.nextInt();
					this.cars.get(carIndex).setTrack(this.tracks.get(trackIndex));
					System.out.println("--------------------------------");
					break;
				case 4:
					Scanner scan4 = new Scanner(System.in);
					System.out.println("������� ������ ���� �� ������");
					int carIndex2 = scan4.nextInt();
					this.cars.get(carIndex2).unSetTrack();
					System.out.println("--------------------------------");
					break;
				case 5:
					this.printCars();
					System.out.println("--------------------------------");
					break;
				case 6:
					this.printTracks();
					System.out.println("--------------------------------");
					break;
				case 7:
					for (int i = 1; i < this.cars.size(); i++) {
						if (this.cars.get(i).getTrack() != null) {
							System.out.println("�� ���� � ������� " + this.cars.get(i).getNumber() + " ��������� ������ ����� " +
												this.cars.get(i).getTrack().getNumber());
						} else {
							System.out.println("�� ���� � ������� " + this.cars.get(i).getNumber() + " �� ��������� ������");
						}
					}
					System.out.println("--------------------------------");
					break;
				case 8:
					Scanner scan8 = new Scanner(System.in);
					System.out.println("������� ������ ���� �� ������ ��� ������� ���������");
					int carStartIndex = scan8.nextInt();
					cars.get(carStartIndex).start();
					System.out.println("--------------------------------");
					break;
				case 9:
					Scanner scan9 = new Scanner(System.in);
					System.out.println("������� ������ ���� �� ������ ��� ������ ��������");
					int carMoveIndex = scan9.nextInt();
					cars.get(carMoveIndex).move();
					System.out.println("--------------------------------");
					break;
				case 10:
					Scanner scan10 = new Scanner(System.in);
					System.out.println("������� ������ ���� �� ������ ��� ���������");
					int carStopIndex = scan10.nextInt();
					cars.get(carStopIndex).stop();
					System.out.println("--------------------------------");
					break;
				case 11:
					System.out.println("������ �����������:");
					for (int i = 1; i < this.cars.size(); i++) {
						this.cars.get(i).printAboutMe();
					}
					System.out.println("������ ��������:");
					for (int i = 1; i < this.tracks.size(); i++) {
						this.tracks.get(i).printAboutMe();
					}
					break;
				case 12:
					System.out.println("�� ��������");
					runWhile = false;
					break;
				default: System.out.println("������� �������� �������");
				System.out.println("--------------------------------");
			}
		}
	}

	public void printCars() {
		for (int i = 1; i < cars.size();i ++) {
			System.out.println(i + ". ���������� " + this.cars.get(i).getNumber());
		}
	}

	public void addCar(Car car) {
		this.cars.add(car);
		car.setAutoSalon(this);
	}

	public void printTracks() {
		for (int i = 1; i < tracks.size();i ++) {
			System.out.println(i + ". ������ " + this.tracks.get(i).getNumber());
		}
	}

	public void addTrack(Track track) {
		this.tracks.add(track);
		track.setAutoSalon(this);
	}
}