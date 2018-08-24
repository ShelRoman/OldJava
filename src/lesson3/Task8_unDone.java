/* ask8. ??????? ???? ?? ???????? k. k ? ???????
    *  
   * *
  *   *
 *     * 
  *   *
   * *
    *
 */
package lesson3;

import java.util.Scanner;

public class Task8_unDone {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("??????? ?????? ?????");
		int k = scan.nextInt();
		diamond(k);

	}

	public static void diamond(int k) {
		for (int t = 0; t < k; t++) {
			if (t == 0 || t == k - 1) {
				System.out.print(" ");
				System.out.print(" ");
				System.out.print(" ");
				System.out.print("*");
			} else {
				System.out.print(" ");
				System.out.print("*");
				for (int i = 0; i < k - 1; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
