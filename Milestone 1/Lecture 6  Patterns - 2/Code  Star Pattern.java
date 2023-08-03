/*
Code : Star Pattern

Print the following pattern
Pattern for N = 4

Hint:
As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
The dots represent spaces.

Input Format :

N (Total no. of rows)

Output Format :

Pattern in N lines

Constraints :

0 <= N <= 50

Sample Input 1 :

3

Sample Output 1 :

   *
  *** 
 *****

Sample Input 2 :

4

Sample Output 2 :

    *
   *** 
  *****
 *******

*/

//Solution :

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int i = 1 ;
		
		while (i <= n) {
			int j = 1 ;
			
			while (j<= n - i ) 
			{
				System.out.print(" ");
				j++;
			}
			
			int num = 1;
			while (num<=i) 
			{
				System.out.print("*");
				num++;
			}
			
			int dec = i - 1 ;
			while (dec >= 1) 
			{
				System.out.print("*");
				dec = dec -1 ;
			}
			
			System.out.println( );
			i++;
		}
	} 
}

