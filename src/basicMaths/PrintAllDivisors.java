/**
 * 
 */
package basicMaths;

import java.util.Scanner;

/**
 * 
 */
public class PrintAllDivisors {
	public static void printDivisors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void printDivisors2(int n) {
		for (int i = 1; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				if (n / i != i) {
					System.out.print(n / i + " ");
				}
			}
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		printDivisors2(n);

	}

}
