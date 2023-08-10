/*
Code Merge Two Sorted Arrays

You have been given two sorted arrayslists(ARR1 and ARR2) of size N and M respectively, merge them into a third arraylist such that the third array is also sorted.
Note
Input Format 
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first arraylist.

Second line contains 'N' single space separated integers representing the elements of the first arraylist.

Third line contains an integer 'M' representing the size of the second arraylist.

Fourth line contains 'M' single space separated integers representing the elements of the second arraylist.
Output Format 
For each test case, print the sorted arraylist(of size N + M) in a single row, separated by a single space.

Output for every test case will be printed in a separate line.

Constraints 

1 = t = 10^2
0 = N = 10^5
0 = M = 10^5
Time Limit 1 sec 
Note
Consider the case when size of the two arrays is not same.

Sample Input 1 

1
5
1 3 4 7 11
4
2 4 6 13

Sample Output 1 

1 2 3 4 4 6 7 11 13 

Sample Input 2 

2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0

Sample Output 2 

4 7 9 10 25 30 100 300 450 500
7 45 89 90

 */

//Solution :


public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int in = arr1.length;
        int jn = arr2.length;
        int k = 0 ;
        int [] arr = new int [in+jn];
        int i = 0 ; 
        int j = 0 ;
        for (; i < in && j<jn ;k++ ){
            if ( arr1[i] <=arr2[j] ){
                arr[k]= arr1[i];
                i++;
            }
            else {
                arr[k]= arr2[j];
                j++;
            }
            }
            while ( i < in ){
                arr[k]= arr1[i];
                i++;
                k++;
            }
            while ( j < jn ){
                arr[k]= arr2[j];
                j++;
                k++;
            }
            return arr;
        }
    }