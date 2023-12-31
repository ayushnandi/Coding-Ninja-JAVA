/*
Array Rotation

There is an array ‘A’ of size ‘N’.
You are also given an integer ‘X’ and direction ‘DIR’. You must rotate the array in the direction of ‘DIR’ by ‘X’ positions.
You must return the rotated array.
For example
Input 
A = [6, 2, 6, 1], X = 1, DIR = ‘LEFT’

Output 
2 6 1 6

Explanation Rotate array ‘A’ to the left one time.
[6, 2, 6, 1] = [2, 6, 1, 6]
Input Format
First-line contains 'T,' denoting the number of Test cases.
For each Test case
The first line contains two integers, ‘N', ‘X’, and the string ‘DIR’.
The second line has ‘N’ integers denoting the array ‘A’.
Output Format-
You must return the rotated array.
Note-
You don’t need to print anything. Just implement the given function.

Constraints 

1 = T = 10
1 = N = 10^5 
1 = X = 10^9
‘DIR’ is an element of {‘LEFT’, ‘RIGHT’}
Time Limit 1 sec

Sample Input 1 

2
4 1 LEFT
1 2 3 4
6 2 RIGHT
1 2 4 3 5 6 

Sample Output 1 

2 3 4 1
5 6 1 2 4 3

Explanation Of Sample Input 1 

For test case one

Input 

A = [1, 2, 3, 4], X = 1, DIR = ‘LEFT’

Output 

2 3 4 1

Explanation Rotate array ‘A’ to the left one time.

[1, 2, 3, 4] = [2, 3, 4, 1]

For test case two

Input 

A = [1, 2, 4, 3, 5, 6], X = 2, DIR = ‘RIGHT’

Output 

5 6 1 2 4 3

Explanation Rotate array ‘A’ to the right one time.

[1, 2, 4, 3, 5, 6] = [6, 1, 2, 4, 3, 5]

Sample Input 2 

2
6 3 LEFT
22 8 4 7 5 10
6 2 RIGHT
9 3 1 6 3 9

Sample Output 2 

7 5 10 22 8 4 
3 9 9 3 1 6 

 */

// Solution :

public class Solution {
    // public static int  reverse (int )  
   
       public static void reverse (int []arr , int s , int n) {
        int i=s,j=n-1;
        while(j>=i){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            }
        }

        public static int[] rotateArray(int []a, int x, String dir) {
            // Write your code here.
            int n = a.length;
            x = x%n;
            if (x>0 &&  dir.equals("LEFT")){
                    reverse(a, 0 , n);
                    reverse (a , 0 , n-x);
                    reverse (a , n-x , n);
                }
            else{
                    reverse ( a, 0 , n );
                    reverse ( a , 0 ,x);
                    reverse ( a , x , n);
                }
                return a;
            }
}