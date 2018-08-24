//Задача:
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
//Интерфейсы: Humanable, Tablable, Glassable, 
//Абстрактные классы: AbstractGlass, AbstractHuman, AbstractTable
//Классы: HumanWoman, HumanMan, GlassCircle, GlassSquare, Table, MainClass

//Когда выливается вода из стакана-стакан кричит я стакан круглый(или квадратный) выливаюсь.
// 
//Задание в Main:
//1. Создать массив из 4-х человек разного пола(пол определяется с помощью Math.random)
//2. Создать список из 10 столов.
//3. Каждый на угад берет стаканы.
//4. Провести перекличку( для каждого вызвать метод printAboutMe(Я м/ж и (если есть) у меня стакан кр/кв))
//5. Для каждого человека с консоли определяем индекс стола, человек выливает воду на стол(если у него есть стакан).
//6. Провести опрос столов на предмет сухости (вызов методов isDry).

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
