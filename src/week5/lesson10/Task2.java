//Task 2. Ќаписать класс, который умеет хранить в себе массив любых типов данных (int, long etc.). 
//–еализовать метод, который возвращает любой элемент массива по индексу.
package week5.lesson10;

public class Task2 <T> {
	T[] vect;
	
	public Task2 (T[] list) {
		vect = list;
	}
	
	public T getValue (int index) {
		return this.vect[index];
	}
	
}
	

