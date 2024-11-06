/*(leetcode 67)
Given two binary strings a and b, return their sum as a binary string.
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
*/import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger firstconversion=new BigInteger(a,2);
        BigInteger secondconversion=new BigInteger(b,2);
        BigInteger hres=firstconversion.add(secondconversion);
        String fres= hres.toString(2);;
        return fres;
    

    }
}
/*Input: a = "11", b = "1"
Output: "100"
*/
