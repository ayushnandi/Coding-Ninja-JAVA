/*
Sum Pattern

Write a program to print triangle of user defined integers sum.

Input Format :

A single integer, N

Output Format :

Required Pattern

Constraints :

0 <= N <= 50

Sample Input 1 :

3

Sample Output 1 :

1=1
1+2=3
1+2+3=6

Sample Input 2 :

 5

Sample Output 2 :

1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15

*/

//Solution :


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

			Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int i = 1 ;
		
		while (i <= n)
		{
				int a = 1 ;
				int j = 0 ;
				while (a <= i)
				{
					if (a < i ) {
						System.out.print(a + "+");
					}
					else {
						System.out.print(a +"=" );
					}
					j = j + a; 
				a++;
			   }
			System.out.print(j);
			System.out.println( );
			i++;
		}
	}
}