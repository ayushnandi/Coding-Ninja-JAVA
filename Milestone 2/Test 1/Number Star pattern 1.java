/*
Number Star pattern 1

Print the following pattern for given number of rows.

Input format :

Integer N (Total number of rows)

Output Format :

Pattern in N lines

Sample Input :

   5

Sample Output :

 5432*
 543*1
 54*21
 5*321
 *4321

*/

//Solution :

import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int i = 1 ;
		int p=1; 
		while (i <= n) {
			int m = n;
			while (m >= 1) {
				if (m ==i) {
					System.out.print("*");
				}
				else {
					System.out.print(m);
				}
				m--;
			}
			System.out.println();
			i++;
		}

	}
}
