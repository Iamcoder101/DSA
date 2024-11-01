/*
Given a positive integer n, The task is to find the value of Σi from 1 to n F(i) where function F(i) for the number i is defined as the sum of all divisors of i.

Examples:

Input: n = 4
Output: 15
Explanation:
F(1) = 1
F(2) = 1 + 2 = 3
F(3) = 1 + 3 = 4
F(4) = 1 + 2 + 4 = 7
So, F(1) + F(2) + F(3) + F(4)
    = 1 + 3 + 4 + 7 = 15

*/

class Solution {
    public static long sumOfDivisors(int n) {
      /*  long sum=0;
        for(int i=1;i<=n;i++){
            sum+=fact(i); 
        }
        return sum;
        
    }
    public static long fact(int i){
        long s=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
              s+=j;  
            }
        }
        return s;
    */
    long sum=0;
        long[] div=new long[n+1];
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                div[j]+=i;
            }
        }
        
        for(int k=1;k<=n;k++){
            sum=sum+div[k];
        }
        return sum;
    }
}

//method 2
 class Solution {
    public static long sumOfDivisors(int n) {
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=fact(i); 
        }
        return sum;
        
    }
    public static long fact(int i){
        long s=0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
              s+=j;  
            }
        }
        return s;
    }}
/*For Input: 
5
Your Output: 
21*/


  
