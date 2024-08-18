/**
 * 
 */
package basicMaths;

import java.util.Scanner;

/**
 * 
 */
public class Palindrome {
	public static boolean isPlaindrome(int n) {
		int num = n, rev = 0;
		while (num > 0) {
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}
		if (rev == n) {
			return true;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		if (isPlaindrome(n)) {
			System.out.println(n + " is palindrome.");
		} else {
			System.out.println(n + " is not palindrome.");
		}

	}

}
