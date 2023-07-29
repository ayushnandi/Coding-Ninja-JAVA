/*
Find Character Case
Send Feedback
Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.


1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.


Example:

Input: Character is 'a'.

Output: 0

Explanation: The input character is lowercase, so our answer is 0.

Input format :

The only line contains a single character.


Output format :

The only line contains 1, 0, or -1 according to the above rules.

Sample Input 1 :

v

Sample Output 1 :

0

Explanation of Sample Input 1:

The input character is lowercase, so our answer is 0.

Sample Input 2 :
V

Sample Output 2 :
1

Sample Input 3 :
#

Sample Output 3 :
-1


Expected time complexity :
The expected time complexity is O(1).


Constraints :
The input can be any character.
*/

// solution

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
    Scanner s = new Scanner(System.in);
    char a = s.next().charAt(0)  ;
    int n = a ; 

    if ( n>=65 && n<=90  ){
        System.out.println(1);
    }
    else if ( n>=97 &&n <=122 ){
        System.out.println(0);
    }
    else {
        System.out.println(-1);
    }
    }
}
