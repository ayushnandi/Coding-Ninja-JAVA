/*
Check Array Rotation

You have been given an integer arraylist(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' (K is greater than 0) in the right hand direction.
Your task is to write a function that returns the value of 'K', that means, the index from which the arraylist has been rotated.
Input format 
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the arraylist.

Second line contains 'N' single space separated integers representing the elements in the arraylist.
Output Format 
For each test case, print the value of 'K' or the index from which which the arraylist has been rotated.

Output for every test case will be printed in a separate line.
Constraints 
1 = t = 10^2
2 = N = 10^5
Time Limit 1 sec

Sample Input 1

1
6
5 6 1 2 3 4

Sample Output 1

2

Sample Input 2

2
5
3 6 8 9 10
4
10 20 30 1

Sample Output 2

0
3
 */

//Solution :

public class Solution {
    
    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here

{
	    
	    int n=arr.length;
	    if(n==1||n==0)
	    {
	        return 0;
	    }
	    int i=0;
	    int ans=0;
	    while(i<n)
	    {
	       if(i-1>=0)
	       {
	           if(arr[i-1]>arr[i])
	            {
	               ans=i;
	               break;
	            }
	       }
	       i++;
	    }
	    return ans;
	}
}}