/**
 * 
 */
package basicMaths;

import java.util.Scanner;

/**
 * 
 */
public class ArmstrongNumber {
	public static int countDigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	public static boolean isArmstrong(int n) {
		int sum = 0, num = n;
		int p = countDigit(n);
		while (num > 0) {
			sum += (int) Math.pow(num % 10, p);
			num /= 10;
		}
		if (n == sum) {
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
		if (isArmstrong(n)) {
			System.out.println(n + " is armstrong number");
		} else {
			System.out.println(n + " is not armstrong number");
		}

	}

}
