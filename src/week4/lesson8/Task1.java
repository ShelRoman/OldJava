/*Task1. Создать класс Notepad (записная книжка) с внутренним клас-
сом или классами, с помощью объектов которого могут хра-
ниться несколько записей на одну дату.
Notepad( ArrayList<Data> datas; )
Data ( GregorianCalendar date; ArrayList<String> list; )
public class NotepadMain {

 public static void main(String[] args) {
  Notepad n = new Notepad();
  GregorianCalendar date1 = new GregorianCalendar(2015,01,20);
  GregorianCalendar date2 = new GregorianCalendar(2015,01,21);
  n.add(date1, "Первая строка");
  n.add(date1, "Вторая строка");
  n.add(date2, "Третья строка");
  n.printByDate(date1);
 }
}*/
package week4.lesson8;

public class Task1 {
	
}

