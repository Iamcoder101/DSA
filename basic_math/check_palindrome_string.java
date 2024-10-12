/*
(leet code)
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/
//java program to check whether a string(num) is palindrome logic from scratch 
class Solution {
    public boolean isPalindrome(int x) {
        boolean r;
        String rev="";
        String s=Integer.toString(x);
        for(int i=s.length()-1;i>=0;i--){
           rev+=s.charAt(i);
        }
        if(s.equals(rev)){
            r=true;
        }else{
            r=false;
        }
       
        return r;
    }
}
/*
Input:
x =121
Output:
true*/
