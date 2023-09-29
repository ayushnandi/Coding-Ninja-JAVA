/*
Check Palindrome (recursive)

Check whether a given String 'S' is a palindrome using recursion.

Return true or false.

Note
You don’t need to print anything. Just implement the given function.
Example
Input s = racecar
Output true
Explanation racecar is a palindrome.

Input Format

The first and only line of the input contains string S.

Output format

Return a boolean value True or False.

Sample Input 1

abbba

Sample Output 1

true

Explanation Of Sample Input 1 

“abbba” is a palindrome

Sample Input 2

abcd

Sample Output 2

false

Explanation Of Sample Input 2 

“abcd” is not a palindrome.

Constraints

0 = S = 10^6

where S represents the length of string S.

*/

//Solution :


public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
		int l = input.length();
		int i = 0;
		return helper ( input, i , l);
	}
	public static boolean helper (String a, int i, int l){
		if (l==a.length()/2){
			return true;
		}
		if (a.charAt(l-1)!=a.charAt(i)){
			return false;
		}
		return helper(a,i+1,l-1);
	}
}
