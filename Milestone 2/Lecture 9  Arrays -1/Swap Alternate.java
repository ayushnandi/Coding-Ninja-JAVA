/*
Swap Alternate

You have been given an arraylist(ARR) of size N. You need to swap every pair of alternate elements in the arraylist.
You don't need to print or return anything, just change in the input array itself.

Input Format 

The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the arraylist.

Second line contains 'N' single space separated integers representing the elements in the arraylist.

Output Format 

For each test case, print the elements of the resulting array in a single row separated by a single space.

Output for every test case will be printed in a separate line.

Constraints 

1 = t = 10^2
0 = N = 10^5

Time Limit 1sec

Sample Input 1

1
6
9 3 6 12 4 32

Sample Output 1 

3 9 12 6 32 4

Sample Input 2

2
9
9 3 6 12 4 32 5 11 19
4
1 2 3 4

Sample Output 2 

3 9 12 6 32 4 11 5 19 
2 1 4 3 

*/

// Solution 


public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        if (arr.length % 2==0){
            for (int i =0, j =1 , k=0 ;i < arr.length ; i+=2, j+=2, k+=2 ){
                k = arr[i];
                arr[i]= arr[i +1];
                arr[j]= k;
        }
        }
        else{
             for (int i =0, j =1 , k=0 ;i < arr.length-1 ; i+=2, j+=2 ){
                k = arr[i];
                arr[i]= arr[i +1];
                arr[j]= k;
        }
        }
    }
}