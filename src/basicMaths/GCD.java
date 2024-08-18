/**
 * 
 */
package basicMaths;

import java.util.Scanner;

/**
 * 
 */
public class GCD {
	public static int gcd(int f, int s) {
		int small = Math.min(f, s);
		int gcd = 0;
		for (int i = 1; i <= small; i++) {
			if (f % i == 0 && s % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static int gcd2(int f, int s) {
		int large = Math.max(f, s);
		int small = Math.min(f, s);
		while (small != 0) {
			int rem = large % small;
			large = small;
			small = rem;
		}
		return large;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int f = sc.nextInt();
		System.out.println("Enter the second number :");
		int s = sc.nextInt();
		System.out.println("GCD of " + f + " and " + s + " is " + gcd2(f, s));

	}

}
