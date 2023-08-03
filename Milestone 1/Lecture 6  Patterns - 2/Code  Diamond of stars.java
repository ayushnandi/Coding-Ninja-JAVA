/*
Code : Diamond of stars

Print the following pattern for the given number of rows.

Note: N is always odd.

Pattern for N = 5

The dots represent spaces.


Input format :

N (Total no. of rows and can only be odd)

Output format :

Pattern in N lines

Constraints :

1 <= N <= 49

Sample Input 1:

5

Sample Output 1:

  *
 ***
*****
 ***
  *

Sample Input 2:

3

Sample Output 2:

  *
 ***
  *

*/

//Solution :

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
    Scanner s = new Scanner (System.in);
    int n = s.nextInt();
    int i = 1;

    while (i <= n){
        int j = 1;
        while (j <= (n / 2) - i + 1) {
            System.out.print(" ");
            j++;
        }

        int f = 1 ;
        int star = (2*i)-1;
        while (f <= star){
            System.out.print("*");
        }
        System.out.println( );
    	}
    }
}