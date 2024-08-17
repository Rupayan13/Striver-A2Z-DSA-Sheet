/**
 * 
 */
package patterns;

import java.util.Scanner;

/**
 * 
 */
public class Pattern17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int p=1;
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((2 * i) - 1)/2; j++) {
				System.out.print((char)(64+p));
				p++;
			}
			for (int j = (((2 * i) - 1)/2) +1; j <= (2 * i) - 1; j++) {
				System.out.print((char)(64+p));
				p--;
			}
			System.out.println();
		}

	}

}
