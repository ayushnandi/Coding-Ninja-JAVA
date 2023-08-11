/*
Sum of two arrays

Two random integer arrayslists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrayslists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each arraylist as an integer in itself of digits N and M.
You need to find the sum of both the input arrayslist treating them as two integers and put the result in another arraylist i.e. output arraylist will also contain only single digit at every index.
Note
The sizes N and M can be different. 

Output arraylist(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger arraylist. Place 0 at the 0th index if there is no carry. 

No need to print the elements of the output arraylist.
Using the function sumOfTwoArrays, write the solution to the problem and store the answer inside this output arraylist. The main code will handle the printing of the output on its own.
Input format 
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first arraylist.

Second line contains 'N' single space separated integers representing the elements of the first arraylist.

Third line contains an integer 'M' representing the size of the second arraylist.

Fourth line contains 'M' single space separated integers representing the elements of the second arraylist.

Output Format 
For each test case, print the required sum of the arrayslist in a row, separated by a single space.

Output for every test case will be printed in a separate line.

Constraints 

1 = t = 10^2
0 = N = 10^5
0 = M = 10^5

Time Limit 1 sec 

Sample Input 1

1
3
6 2 4
3
7 5 6

Sample Output 1

1 3 8 0

Sample Input 2

2
3
8 5 2
2
1 3
4
9 7 6 1
3
4 5 9

Sample Output 2

0 8 6 5
1 0 2 2 0 

 */

// Solution :

public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        // Your code goes here
        int len1 = arr1.length, len2 = arr2.length, c = 0, sum, q = 0, k, i, j;
        i = len1 - 1;
        j = len2 - 1;
        if (len1 > len2) {
            k = len1;
        } 
        else {
            k = len2;
        }
        while (i >= 0 && j >= 0) {
            sum = arr1[i] + arr2[j] + q;
            if (sum > 9) {
                c = sum % 10;
                q = sum / 10;
            } 
            else {
                c = sum;
                q = 0;
            }
            output[k] = c;
            i--;
            j--;
            k--;
        }
        while (i >= 0) {
            sum = arr1[i] + q;
            if (sum > 9) {
                c = sum % 10;
                q = sum / 10;
            } 
            else {
                c = sum;
                q = 0;
            }
            output[k] = c;
            i--;
            k--;
        }
        while (j >= 0) {
            sum = arr2[j] + q;
            if (sum > 9) {
                c = sum % 10;
                q = sum / 10;
            } 
            else {
                c = sum;
                q = 0;
            }
            output[k] = c;
            j--;
            k--;
        }
        output[k] = q;
    }
}