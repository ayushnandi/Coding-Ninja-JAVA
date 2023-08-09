/*
Sort 0 1

You have been given an integer arraylist(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this arraylist. Think of a solution which scans the arraylist only once and don't require use of an extra arraylist.
Note
You need to change in the given arraylist itself. Hence, no need to return or print anything. 
Input format 
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the arraylist.

Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the arraylist.
Output format 
For each test case, print the sorted arraylist elements in a row separated by a single space.

Output for every test case will be printed in a separate line.

Constraints 

1 = t = 10^2
0 = N = 10^5

Time Limit 1 sec

Sample Input 1

1
7
0 1 1 0 1 0 1

Sample Output 1

0 0 0 1 1 1 1

Sample Input 2

2
8
1 0 1 1 0 1 0 1
5
0 1 0 1 0

Sample Output 2

0 0 0 1 1 1 1 1
0 0 0 1 1 

*/

// Solution :

public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes hereint nextZero = 0;
        int nextZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                nextZero += 1;
            }
        }
    }
}

