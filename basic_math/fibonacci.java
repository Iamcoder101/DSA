/*The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
*/class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int c=1;
        if(n==0){
            return 0;
        }
        n=n-1;
        while(n>0){
            c=a+b;
            a=b;
            b=c;
            n=n-1;
        }
        return c;
    }
}
/*
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.*/
