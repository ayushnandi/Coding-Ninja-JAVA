/*
Zeros and Stars Pattern

Print the following pattern
Pattern for N = 4

000000
000000
000000
000000

Input Format 

N (Total no. of rows)

Output Format 

Pattern in N lines

Sample Input 1 

3

Sample Output 1 

0000
0000
0000

Sample Input 2 

5

Sample Output 2 

00000000
00000000
00000000
00000000
00000000

 */

// Solution :

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int p = 1;
		while (i <= n) {
			int m = n;
			int j = 1;
			while (m + 1 >= j) {
				if (j == i || m + 1 == j) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
				j++;
			}

			int h = n;
			while (h >= 1) {
				if (h == i) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
				h--;
			}
			System.out.println();
			i++;
		}   
	}
}
