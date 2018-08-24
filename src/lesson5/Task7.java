/*Task 7. Написать метод, принимающий в качестве параметра строку. 
 Возвратить индекс первого вхождения символа "a" этой строки. */
package lesson5;

public class Task7 {

	public static void main(String[] args) {
		String find = "rocket in the basket";
		findIndex(find);
	}
	
	public static void findIndex(String find) {
		int index = find.indexOf('a');
		if (index < 0) {
			System.out.println("В данной строке нет символа 'а'");
		} else {
			System.out.println(index);	
		}
		
	}
}
//done