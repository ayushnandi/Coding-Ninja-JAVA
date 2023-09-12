/*
Check Number in Array

Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.

Input Format 

Line 1  An Integer N i.e. size of array
Line 2  N integers which are elements of the array, separated by spaces
Line 3  Integer x

Output Format 

'true' or 'false'

Constraints 

1 = N = 10^3

Sample Input 1 

3
9 8 10
8

Sample Output 1 

true

Sample Input 2 

3
9 8 10
2

Sample Output 2 

false

 */

//Solution :

public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
			return inputsum(0, x, input);
	}
	public static boolean inputsum(int n,int x, int input [] ){
		
		// System.out.print(input[x]+" ");
		if (n== input.length){
			return false;
		}
		if (input[n] == x ){
			return true;
		}
		return inputsum(n+1,x,input);
		
	}
}