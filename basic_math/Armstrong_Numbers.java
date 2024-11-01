/*You are given a 3-digit number n, Find whether it is an Armstrong number or not.

An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

Note: Return true if it is an Armstrong number else return false.

Examples

Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. 
Input: n = 372
Output: false
Explanation: 372 is not an Armstrong number since 33 + 73 + 23 = 378.*/

class Solution {
    static boolean armstrongNumber(int n) {
        int rem;
        int m=n;
       int sum=0;
        while(n!=0){
            rem=n%10;
            sum=(int)(sum+Math.pow(rem,3));
            n=n/10;
        }
        if(m==sum){
            return true;
        }else{
            return false;
        }
    }
}
/*
For Input: 
153
Your Output: 
true
*/
