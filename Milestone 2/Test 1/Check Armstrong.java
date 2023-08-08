/*
Check Armstrong

You are given an integer 'n'.


Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.


Note
An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.


Example
Input 'n' = 1634

Output true

Explanation
1634 is an Armstrong number, as 1^4 + 6^4 + 3^4 + 4^4 = 1634


Input Format 
The first line of the input contains an integer 'n'.


Output Format 
Return 'true' or 'false' as mentioned in the problem statement.


Note
You don't need to print anything, just implement the given function. true will be printed if the returned value is a boolean 'true' and false otherwise.
Sample Input 1 
1


Sample Output 1 
true


Explanation of Sample Input 1 
1 is an Armstrong number as, 1^1 = 1.


Sample Input 2 
103


Sample Output 2 
false


Expected Time Complexity
Try to solve this in O(log(n)). 


Constraints
1 = ‘n’ = 10^9

Time Limit 1 sec
 */

// Solution :

import java.util.Scanner;
public class Main {
	
	static boolean isArmstrong(int num)   
    {   
        int temp, digits=0, last=0, sum=0;   
        temp = num; 
        for(; temp > 0; temp = temp/10)
        {
            digits++;
        }
        temp = num;   
        for(; temp > 0; temp = temp/10) 
        {   
            last = temp % 10;   
            sum +=  (Math.pow(last, digits));   
        }  
        if(num == sum)   
            return true;      
        else 
            return false;
    }   
    //driver code  
    public static void main(String args[])     
    {     
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();  
        if ( isArmstrong(n) ) 
            System.out.println("true");
        else
            System.out.println("false");
    }   
}