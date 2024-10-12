/*
Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD. The function takes two integers a and b as input and returns a list containing their LCM and GCD.

Example 1:

Input: a = 5 , b = 10
Output: 10 5
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
Input: a = 14 , b = 8
Output: 56 2
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
*/

class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
   long c=B;
   long d=A;
   long r=1;
   if(B>A){
       long temp=A;
       A=B;
       B=temp;
   }
   while(true){
       r=A%B;
       if(r!=0){
           A=B;
           B=r;
           continue;
       }else{
           break;
       }
   }
  long lcm=(c*d)/B;
  Long[] arr={lcm,B};
  return arr;
    }
}

/*
Input: 
5 10
Output: 
10 5
*/
