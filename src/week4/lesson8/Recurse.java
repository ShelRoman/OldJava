//Task1. Ќаписать рекурсивный метод, который принимает в качестве параметров k.
//ћетод выводит числа от k до 2.

//Task2. Ќаписать рекурсивный метод, который принимает в качестве параметров k.
//ћетод выводит числа от 2 до k.

//Task3. Ќаписать метод, который считает факториал дл€ числа n.

//Task4. Ќаписать метод, который выводит n-ный член последовательности ‘ибоначчи
//A( n ) = A(n-1) + A(n-2); A(1) = A(2) = 1

//Task5. Ќаписать рекурсивный метод, провер€ющий €вл€етс€ ли число простым.

package week4.lesson8;

public class Recurse {

	public static void main(String[] args) {
		System.out.println(recurseIsPrime(11, 2));

	}

	public static void recurse1(int k) {
		if (k < 2) {
			System.out.println(k);
			recurse1(k + 1);
		} else if (k > 2) {
			System.out.println(k);
			recurse1(k - 1);
		}

	}

	public static void recurse2(int k) {
		if (k > 2) {
			recurse2(k - 1);
			System.out.println(k);
		} else if (k < 2) {
			recurse2(k + 1);
			System.out.println(k);
		}

	}

	public static int recurseFact(int n) {
		int result = 1;
		if (n > 1) {
			result = (n * recurseFact(n - 1));
		}
		return result;
	}

	public static int recurseFibo(int n) {
		int result = 1;
		if (n == 1 || n == 0) {
			return result;
		} else {
			result = recurseFibo(n - 2) + recurseFibo(n - 1);
		}
		return result;
	}

	public static boolean recurseIsPrime(int n,  int i) {
		return false;
	}
}
