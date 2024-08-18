/**
 * 
 */
package basicMaths;

import java.util.Scanner;

/**
 * 
 */
public class ReverseNumber {
	public static int reverseANumber(int n) {
		int rev = 0;
		while (n > 0) {
			rev = (rev * 10) + (n % 10);
			n /= 10;
		}
		return rev;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println("Reverse of " + n + " is " + reverseANumber(n));

	}

}
