/*
Move all negative numbers

You are given an array 'ARR' consisting of 'N' integers. You need to rearrange the array elements such that all negative numbers appear before all positive numbers.
Follow Up
Can you solve this in O(1) auxiliary space
Note
The order of elements in the resulting array is not important.
Example
Let the array be [1, 2, -3, 4, -4, -5]. On rearranging the array such that all negative numbers appear before all positive numbers we get the resulting array [-3, -5, -4, 2, 4, 1].
Input format
The very first line of input contains an integer ‘T’ denoting the number of test cases. 

The first line of every test case contains an integer ‘N’ denoting the number of elements present in the array.

The second line of every test case contains ‘N’ space-separated integers denoting the elements present in the array.
Output format
For each test case, “Yes” is printed if the resulting array is correct otherwise “No”.

Output for each test case is printed on a separate line.
Constraints
1 = T = 10
1 = N = 5  10^4
-10^5 = ARR[i] = 10^5

Where  ‘T’ represents the number of test cases and ‘N’ represents the number of elements present in the array.

Time Limit 1 sec

Sample Input 1

2
5
1 -4 -2 5 3
2
2 1    

Sample Output 1

Yes
Yes

Explanation for Sample Input 1

For the first test case we have, array [1, -4, -2, 5, 3] and N = 5. On rearranging the array such that all negative numbers appear before all positive numbers we get the resulting array [-2, -4, 1, 5, 3].

For the second test case we have, array [2, 1] and N = 2. There are no negative numbers. Hence, we do not require any rearrangement.

Sample Input 2

3
4
1 -5 -5 3
5
-1 -2 3 4 5
1
-2

Sample Output 2

Yes 
Yes
Yes

Explanation for Sample Input 2

For the first test case we have, array [1, -5, -5,  3] and N = 4. On rearranging the array such that all negative numbers appear before all positive numbers we get the resulting array [-5, -5, 1, 3].

For the second test case we have, array [-1, -2, 3, 4, 5] and N = 5. There are already arranged in required way. Hence, we do not require any rearrangement.

For the third test case we have, array [-2 ] and N = 1. The array is already arranged in required way. Hence, we do not require any rearrangement.

 */

// Solution :

public class Solution {
    public static int[] separateNegativeAndPositive(int[] arr) {
        int n = arr.length;
        // creating a new array
        int ans[] = new int[n];
        int k = 0;// for keeping the track of index of last negative number
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 0) {
                ans[k++] = arr[i];
            }
        } // loop for filling positive numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                ans[k++] = arr[i];
            }
        }
        return ans;
    }
}