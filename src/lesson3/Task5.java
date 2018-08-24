/* Task5. ¬ main считать с консоли два числа, (например k и n) и передать методу f.
 ¬ методе f вывести числа от k до n, при этом последовательность может быть возрастающа€ или убывающа€. */
package lesson3;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("¬ведите 2 числа");
	int k = scan.nextInt();
	int n = scan.nextInt();
	f(k, n);
	}
		
	public static void f(int k, int n) {
		if(k > n) {
			while(k >= n) {
				System.out.print(k + ", ");
				k--;
			}
		}
		else if(k < n) {
			while(k <= n) {
				System.out.print(k + ", ");
				k++;
			}
		}
		else {
			System.out.println("„исла равны");
		}
	
	}
}

//done