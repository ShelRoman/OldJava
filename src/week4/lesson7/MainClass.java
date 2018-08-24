//������:
//public interface Humanable {
// public void takeGlass(AbstractGlass glass);
// public void putGlass();
// public void pourWaterOnTable(AbstractTable table);
// public void fillGlass();
// public void printAboutMe();
//}
//public interface Glassable {
// public void pourFromMe();
//}
//public interface Tablable {
// public boolean isDry();
//}
//
//����������: Humanable, Tablable, Glassable, 
//����������� ������: AbstractGlass, AbstractHuman, AbstractTable
//������: HumanWoman, HumanMan, GlassCircle, GlassSquare, Table, MainClass

//����� ���������� ���� �� �������-������ ������ � ������ �������(��� ����������) ���������.
// 
//������� � Main:
//1. ������� ������ �� 4-� ������� ������� ����(��� ������������ � ������� Math.random)
//2. ������� ������ �� 10 ������.
//3. ������ �� ���� ����� �������.
//4. �������� ����������( ��� ������� ������� ����� printAboutMe(� �/� � (���� ����) � ���� ������ ��/��))
//5. ��� ������� �������� � ������� ���������� ������ �����, ������� �������� ���� �� ����(���� � ���� ���� ������).
//6. �������� ����� ������ �� ������� ������� (����� ������� isDry).

package week4.lesson7;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
//		AbstractHuman man1 = new HumanMan("Man");
//		AbstractGlass glass1 = new GlassCircle("Circle");
//		man1.takeGlass(glass1);
//		Table table1 = new Table();
//		man1.setTable(table1);
//		man1.pourWaterOnTable(man1.getTable());
//		System.out.println(table1.isDry());
		ArrayList<AbstractHuman> humans = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			int gender = (int) ((int) 2 * (Math.random()));
			if (gender == 0) {
				humans.add(new HumanWoman("Woman"));
			} else {
				humans.add(new HumanMan("Man"));
			}
		}
		ArrayList<AbstractTable> tables = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			tables.add(new Table());
		}
		for (int i = 0; i < humans.size(); i++) {
			int glass = (int) ((int) 3 * (Math.random()));
			if (glass == 1) {
				humans.get(i).takeGlass(new GlassCircle("Circle"));
			} else if (glass == 2) {
				humans.get(i).takeGlass(new GlassSquare("Square"));
			}
		}
		for (int i = 0; i < humans.size(); i++) {
			humans.get(i).printAboutMe();
		}
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < humans.size(); i++) {
			System.out.println("Enter index of table");
			int table = scan.nextInt();
			humans.get(i).pourWaterOnTable(tables.get(table));
		}
		for (int i = 0; i < tables.size(); i++) {
			System.out.println(tables.get(i).isDry());
		}
	}

}
