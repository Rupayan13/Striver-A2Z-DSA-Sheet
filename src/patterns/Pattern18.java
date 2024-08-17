/**
 * 
 */
package patterns;

import java.util.Scanner;

/**
 * 
 */
public class Pattern18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int n = sc.nextInt();
		int p=n;
		for(int i=1;i<=n;i++) {
			int x=p;
			for(int j=1;j<=i;j++){
				System.out.print((char)(64+x++)+" ");
			}
			p--;
			System.out.println();
		}

	}

}
