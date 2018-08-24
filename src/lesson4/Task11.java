/*Task11.
Ќаписать метод, который принмает в качестве параметров массив целых чисел, 
в котором заполн€ет только элементы с четными индексами значением индекса.
“акже метод, который выводит массив на экран в следующем формате {11,22,35,48,18}.*/
package lesson4;

public class Task11 {

	public static void main(String[] args) {
		int[] vector = new int[(int) ((int) 66 * Math.random())];
		fillVector(vector);
		printVector(vector);

	}
	public static void fillVector(int[] vect) {
		int m = 2;
		for(int i = 2; i < vect.length; i = i + 2) {
			vect[i] = m;
			m += 2;
		}
	}
	
	public static void printVector(int[] vect) {
		System.out.print("{");
		for(int i = 0; i < vect.length -1 ; i++){
			System.out.print(vect[i] + ", ");
	    }
		System.out.print(vect[vect.length - 1] + "}");
	}
}
//done
