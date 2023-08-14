/*
Reverse Each Word

Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed. A word is a combination of characters without any spaces.
Example
Input Sentence Hello, I am Aadil!
The expected output will print, ,olleH I ma !lidaA.
Input Format
The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
Output Format
The only line of output prints the sentence(string) such that each word in the sentence is reversed. 

Constraints
0 = N = 10^6

Where N is the length of the input string.

Time Limit 1 second

Sample Input 1

Welcome to Coding Ninjas

Sample Output 1

emocleW ot gnidoC sajniN

Sample Input 2

Always indent your code

Sample Output 2

syawlA tnedni ruoy edoc

 */

// Solution :


public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
	int end = str.length() - 1,start,j;
		String result ="",word = "";
		for(int i= str.length() - 1;i >= 0;i--) {
			if(str.charAt(i) == ' ') {
				start = i + 1;
				word = "";
				for(j = start;j <= end;j++) {
					word = str.charAt(j) + word;
				}
				end  = i - 1;
				result =  word + " " +result ;
			}
		}
		word = "";
		for(j = 0;j <= end;j++) {
			word = str.charAt(j)+word ;
		}
		result = word +" "+ result;
		return result;
	}
}