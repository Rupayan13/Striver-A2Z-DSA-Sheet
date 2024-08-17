/**
 * 
 */
package patterns;

import java.util.Scanner;

/**
 * 
 */
public class Pattern19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int n = sc.nextInt();
		int s = 0;
		for (int i = (n / 2); i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int sp = 0; sp <= s; sp++) {
				System.out.print(" ");
			}
			s += 2;
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s-=2;
		for (int i = 1; i <= (n / 2); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int sp = s; sp >= 0; sp--) {
				System.out.print(" ");
			}
			s -= 2;
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
