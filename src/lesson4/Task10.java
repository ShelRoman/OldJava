/*Task10. Написать класс с методами. 
 - Метод заполнения массива случайными числами от 0 до 100. 
 - Метод вывода на экран
 -   Метод вывода части массива, который принимает в качестве параметров: массив, индекс элемента с которого выводить и индекс элемента по который выводить
 -   Метод, который принимает в качестве параметра массив и возвращает его размер. 
 -  Главный метод
 */
package lesson4;

public class Task10 {
	public static void main(String[] args) {
		int[] vector = new int[10];
		fillVectorByRandom(vector);
		printVector(vector);
		printPartVector(vector, 2, 8);
		System.out.println("size = " + getSizeVector(vector));
	}

	public static void fillVectorByRandom(int[] vector) {
		for(int i = 0; i < vector.length; i++){
			vector[i] = (int)(100 * Math.random());
		}
	}

	public static void printVector(int[] vect) {
		for(int i = 0; i < vect.length; i++){
			System.out.print(vect[i] + ", ");
	    }
		System.out.println();
	}

	public static void printPartVector(int[] vect, int indexBegin, int indexEnd) {
		for(int i = indexBegin - 1; i < indexEnd; i++){
			System.out.print(vect[i] + ", ");
		}
		System.out.println();
	}

	public static int getSizeVector(int[] vect) {
		return vect.length;
	}
}
//done