/*
Sort 0 1 2

You are given an integer arraylist(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this arraylist in a 'single scan'.
'Single Scan' refers to iterating over the arraylist just once or to put it in other words, you will be visiting each element in the arraylist just once.
Note
You need to change in the given arraylist itself. Hence, no need to return or print anything. 
Input format 
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the arraylist.

Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the arraylist.
Output Format 
For each test case, print the sorted arraylist elements in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints 
1 = t = 10^2
0 = N = 10^5
Time Limit 1 sec

Sample Input 1

1
7
0 1 2 0 2 0 1

Sample Output 1

0 0 0 1 1 2 2 

Sample Input 2

2
5
2 2 0 1 1
7
0 1 2 0 1 2 0

Sample Output 2

0 1 1 2 2 
0 0 0 1 1 2 2

 */

// Solution :

import java.util.*;
public class Solution {

    public static void sort012(int[] arr){
    	int l=0;
		int n = arr.length;
	    int h=n-1;
	    int mid=0;
	    int temp=-1;
	    
	    while(mid<=h){
	        if(arr[mid]==0)
	        {
	            temp=arr[l];
	            arr[l]=arr[mid];
	            arr[mid]=temp;
	            l++;
	            mid++;
	        }
	        else if(arr[mid]==1)
	        {
	            mid++;
	        }
	        else
	        {
	            temp = arr[mid];
                arr[mid] = arr[h];
                arr[h] = temp;
                h--;
	        }
	    }
    }
}
	