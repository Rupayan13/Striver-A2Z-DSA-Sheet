/**
 * 
 */
package patterns;

import java.util.Scanner;

/**
 * 
 */
public class Pattern11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int n = sc.nextInt();
		int startFirst = 1;
		for (int i = 1; i <= n; i++) {
			int first = startFirst;
			for (int j = 1; j <= i; j++) {
				System.out.print(first+" ");
				if (first == 1) {
					first = 0;
				} else {
					first = 1;
				}
			}
			System.out.println();
			if (startFirst == 1) {
				startFirst = 0;
			} else {
				startFirst = 1;
			}
		}

	}

}
