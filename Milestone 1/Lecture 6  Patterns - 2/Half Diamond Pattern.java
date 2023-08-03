/*
Half Diamond Pattern

Write a program to print N number of rows for Half Diamond pattern using stars and numbers

Note : There are no spaces between the characters in a single line.

Input Format :

A single integer: N

Output Format :

Required Pattern

Constraints :

0 <= N <= 50

Sample Input 1 :

3

Sample Output 1 :

*
*1*
*121*
*12321*
*121*
*1*
*

Sample Input 2 :

 5

Sample Output 2 :

*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/

// Solution :

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner (System.in);
				int n = s.nextInt();
				int i = 1 ;
				System.out.print("*");
				System.out.println( );
				
				while (i <= n)
				{		
					System.out.print("*");
					int num = 1;
					int p = i ;
					while (num<=i) 
					{
						System.out.print(num );
						num++;
						p++;
					}
					int dec = i - 1 ;
					int decNum = num - 2 ;
					while (dec >= 1 ) 
					{
						System.out.print(decNum);
						dec-- ;
						decNum--;
					}
					System.out.print("*");
					System.out.println( );
					i++;
				}  
				int n2 = n -1;
				int j = 1 ;
				while ( 1 <= n2 ) {
					
					
					System.out.print("*");
					int num1 = 1;
					while (num1<=n2) 
					{
						System.out.print(num1 );
						num1++;
					}
					int dec = n2 - 1 ;
					int decNum = num1 - 2 ;
					while (dec >= 1 ) 
					{
						System.out.print(decNum);
						dec-- ;
						decNum--;
					}
					
					
					System.out.print("*");
					System.out.println( );
					n2--;
				}
				System.out.println("*");
	  } 
}
