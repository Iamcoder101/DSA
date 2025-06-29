/*
LEET CODE 14

14. Longest Common Prefix
Solved
Easy
Topics
premium lock icon
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.*/



//code
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1){
            return "";
        }else if(strs.length==1){
            return strs[0];
        }
        String res=prefix(strs[0],strs[1]); 
        for(int i=2;i< strs.length;i++){
            String temp=prefix(res,strs[i]);
           if(res.length()>temp.length()){
            res=temp;
           }
        }
        return res;
    }
    public static String prefix(String str1,String str2){
        int length=0;
        StringBuilder res = new StringBuilder();
        if(str1.length()<str2.length()){
        length=str1.length();
        }else{
            length=str2.length();
        }
        for(int i=0;i<length;i++){
            if(str1.charAt(i)==str2.charAt(i)){
               res.append(str1.charAt(i)); 
            }else{
                break;
            }
        }
        return res.toString();
    }
}
