/*
13. Roman to Integer
Easy
LEET CODE 13
Topics
premium lock icon
Companies
Hint
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999


*/


class Solution {
    public int romanToInt(String s) {
        int sum=0;
        HashMap<String,Integer> h=new HashMap<>();
        h.put("I",1);
        h.put("V",5);
        h.put("X",10);
        h.put("L",50);
        h.put("C",100);
        h.put("D",500);
        h.put("M",1000);
        int val=0;
        for(int i=0;i<s.length();i++){
            String c=s.charAt(i)+"";
            String next="";
            if(i<s.length()-1){
                next=s.charAt(i+1)+"";
            }
            if(c.equals("I") &&(next.equals("V")|| next.equals("X"))){
                val=h.get(next)-h.get(c);
                sum=sum+val;
                i=i+1;
            }else if(c.equals("X") &&(next.equals("L")|| next.equals("C"))){
                val=h.get(next)-h.get(c);
                sum=sum+val;
                i=i+1;
            }else if(c.equals("C") &&(next.equals("D")|| next.equals("M"))){
                val=h.get(next)-h.get(c);
                sum=sum+val;
                i=i+1;
            }else{
                sum=sum+h.get(c);
            }
        }
        return sum;
    }
}
