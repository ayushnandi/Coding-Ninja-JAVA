/*
Parallelogram Pattern

Write a program to print parallelogram pattern for the given N number of rows.
For N = 4

The dots represent spaces.

Input Format :

 A single integer : N

Output Format :

Required Pattern

Constraints :

0 <= N <= 50

Sample Input 1 :

3

Sample Output 1 :

***
 ***
  ***

Sample Input 2 :

5

Sample Output 2 :

*****
 *****
  *****
   *****
    *****

*/

// Solution:

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {

			int a = 1;
			while (a <= i - 1) {
				System.out.print(" ");
				a++;
			}
			int j = 1;
			while (j <= n) {
				System.out.print( "*" );
				j++;
			}
			i++;
			System.out.println( );
		}
	}
}
