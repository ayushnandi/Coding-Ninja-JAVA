/*
Terms of AP

Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

Input format :

Integer x

Output format :

Terms of series (separated by space)

Constraints :

1 <= x <= 1,000

Sample Input 1 :

10

Sample Output 1 :

5 11 14 17 23 26 29 35 38 41

Sample Input 2 :

4


Sample Output 2 :

5 11 14 17

*/

//Solution :

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int count = 0;
		for (int i = 1; i <= x ; i ++ ) {
			int f = (3*i) + 2;
			if (f%4 ==0) {
				count ++ ;
				continue;
			}
		}
		x += count;
		
		for (int i = 1; i <= x ; i ++ ) {
			int f = (3*i) + 2;
			if (f%4 ==0) {
				continue;
				}
			System.out.print(f + " ");
		}
	}

}
