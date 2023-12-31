/*
Binary to decimal

Given a binary number as an integer N, convert it into decimal and print.

Input format :

An integer N in the Binary Format

Output format :

Corresponding Decimal number (as integer)

Constraints :

0 <= N <= 10^9

Sample Input 1 :

1100

Sample Output 1 :

12

Sample Input 2 :

111

Sample Output 2 :

7

*/

//Solution :

import java.util.Scanner;
public class Main {
	
		public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int i =  1 ;
		int ans = 0 ;
		while ( n > 0) {
			int rem = (n%10);
			ans = i * rem + ans ;
			
			i *= 2 ;
			n /= 10;
		}System.out.println(ans);
	}

}
