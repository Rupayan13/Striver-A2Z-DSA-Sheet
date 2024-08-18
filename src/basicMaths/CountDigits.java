/**
 * 
 */
package basicMaths;

import java.util.Scanner;

/**
 * 
 */
public class CountDigits {
	public static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println("The number of digits in " + n + " is " + countDigit(n));

	}

}
