/*
Sum Of Array

Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format 
Line 1  An Integer N i.e. size of array
Line 2  N integers which are elements of the array, separated by spaces
Output Format 
Sum

Constraints 

1 = N = 10^3

Sample Input 1 

3
9 8 9

Sample Output 1 

26

Sample Input 2 

3
4 2 1

Sample Output 2 

7    
 */

//Solution :

public class Solution {

	public static int sum(int input[]) {

		return inputsum(0 ,input);

	}
	public static int inputsum(int n, int input [] ){
		if (n== input.length){
			return 0;
		}
		int r = inputsum(n+1, input);
		return input[n]+r;
	}
}