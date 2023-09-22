/*
Quick Sort - Problem Statement

Given the 'start' and the 'end'' positions of the array 'input'. Your task is to sort the elements between 'start' and 'end' using quick sort.

Note 
Make changes in the input array itself.

Input format 

Line 1  Integer N i.e. Array size
Line 2  Array elements (separated by space)

Output format 

Array elements in increasing order (separated by space)

Sample Input 1 

6 
2 6 8 5 4 3

Sample Output 1 

2 3 4 5 6 8

Sample Input 2 

5
1 2 3 5 7

Sample Output 2 

1 2 3 5 7 

Constraints 

1 = N = 10^3
0 = input[i] = 10^9

*/

//Solution:

public class Solution {
	
	public static void quickSort(int[] input) {
		int si = 0;
		int ei = input.length;
		
		Qsort(input , si , ei);
	}
	
	public static int [] Qsort (int []a, int si , int ei){
		if (si >= ei){
			return a;
		}
		int midIndex = partition ( a , si , ei);
		Qsort (a, si , midIndex-1);
		Qsort (a , midIndex+1 , ei);


	}
	public static int partition (int [] a , int si , int  ei ){
		int mid = a[si];
		
		int count = 0;
		for (int i = si+1 ; i < ei ; i++ ){
			if ( a[i] > a[si]){
				count++;
			}
		}
		int temp = a[si];
		a[si] = a[count];
		a[count]= temp;

		int i=si;
        int j=ei;
        while(i<j){
            if(a[i]<mid){
                i++;
            }
			else if(a[j]>=mid){
                j--;
            }
			else{
                 temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
		return si + count;
	}
}