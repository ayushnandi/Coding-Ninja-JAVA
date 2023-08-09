/*
Return Array Sum

Given an arraylist(ARR) of length N, you need to find and return the sum of all the elements in the arraylist.
Input Format 
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the arraylist.

Second line contains 'N' single space separated integers representing the elements in the arraylist.
Output Format 
For each test case, print the sum of the numbers in the arraylist.

Output for every test case will be printed in a separate line.

Constraints 

1 = t = 10^2
0 = N = 10^5

Time Limit 1sec

Sample Input 1

1
3
9 8 9

Sample Output 1

26

Sample Input 2

2
5
1 2 3 4 5 
3
10 20 30 

Sample Output 2

15
60

*/

//Solution :

/*
Return Array Sum
Send Feedback
Given an arraylist(ARR) of length N, you need to find and return the sum of all the elements in the arraylist.
Input Format 
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the arraylist.

Second line contains 'N' single space separated integers representing the elements in the arraylist.
Output Format 
For each test case, print the sum of the numbers in the arraylist.

Output for every test case will be printed in a separate line.
Constraints 
1 = t = 10^2
0 = N = 10^5

Time Limit 1sec

Sample Input 1

1
3
9 8 9

Sample Output 1

26

Sample Input 2

2
5
1 2 3 4 5 
3
10 20 30 

Sample Output 2

15
60

*/

//Solution :

// import java.util.Scanner;
public class Solution {
	
	public static int sum(int[] arr) {

		 	int no = 0;
			for (int i = 0 ; i< arr.length ; i++) 
			{				  
				no += arr[i] ;
			}
			return no;
		}

	}