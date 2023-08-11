/*
Rotate array

You have been given a random integer arraylist(ARR) of size N. Write a function that rotates the given arraylist by D elements(towards the left).
Note
Change in the input arraylist itself. You don't need to return or print the elements.
Input format 
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the arraylist.

Second line contains 'N' single space separated integers representing the elements in the arraylist.

Third line contains the value of 'D' by which the arraylist needs to be rotated.
Output Format 
For each test case, print the rotated arraylist in a row separated by a single space.

Output for every test case will be printed in a separate line.

Constraints 

1 = t = 10^4
0 = N = 10^6
0 = D = N

Time Limit 1 sec

Sample Input 1

1
7
1 2 3 4 5 6 7
2

Sample Output 1

3 4 5 6 7 1 2

Sample Input 2

2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2

Sample Output 2

1 2 3 4 5 6 7
3 4 1 2

 */

// Solution :


public class Solution {  

    public static void reverse(int[] arr, int s, int n) {

        int i = s, j = n - 1;
        while (j >= i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int d) {
        
	    int row = arr.length;
	     if ( row ==0 ){
            System.out.print("");
            return;
        }
    int n = arr.length;
        d = d%n;
        if ( d >0 ){
                reverse(arr, 0 , n);
                reverse (arr , 0 , n-d);
                reverse (arr , n-d , n);
        }   
    }
}