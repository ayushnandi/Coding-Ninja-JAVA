/*
Sum of even & odd

Write a program to input an integer 'n' and print the sum of all its even digits and sum of all its odd digits separately.


Digits mean numbers, not the places! That is, if the given integer is "132456", even digits are 2, 4 and 6 and odd digits are 1, 3 and 5.

Example :

Input: 'n' = 132456

Output: 12 9

Explanation:

The sum of even digits = 2 + 4 + 6 = 12
The sum of odd digits = 1 + 3 + 5 = 9

Input format :

The first line contains an integer 'n'.

Output format :

In a single line, print two space separated integers, first the sum of even digits, and then the sum of odd digits.

Sample Input 1:

132456

Sample Output 1:

12 9

Explanation of sample input 1 :

The sum of even digits = 2 + 4 + 6 = 12
The sum of odd digits = 1 + 3 + 5 = 9

Sample Input 2:

552245

Sample Output 2:

8 15

Expected time complexity :

The expected time complexity is O(log(n)).

Constraints:

0 <= 'n' <= 10 ^ 8
*/

// Solution :

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner s = new Scanner(System.in);
		int n = s.nextInt() ;
		int even = 0 , odd = 0 ; 
		
		while (n > 0 )
		{
			int rem = n%10 ;
			n = n/10 ;
			if (rem%2==0) 
				even = even + rem;
			else 
				odd = odd + rem ;
		}
		System.out.println(even +" "+odd);
	}
}


