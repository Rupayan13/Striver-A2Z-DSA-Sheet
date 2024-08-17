/**
 * 
 */
package patterns;

import java.util.Scanner;

/**
 * 
 */
public class Pattern9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int n = sc.nextInt();
		for (int i = 1; i <= (n / 2); i++) {
			for (int s = 1; s <= (n / 2) - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = (n / 2); i >= 1; i--) {
			for (int s = 1; s <= (n / 2) - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
