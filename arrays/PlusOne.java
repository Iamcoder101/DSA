/*
LEETCODE:66
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/
//first way using conversion
import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
       BigInteger bsum=BigInteger.ZERO;
        for(int i=0;i<digits.length;i++){
           bsum=bsum.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
        }
         bsum=bsum.add(BigInteger.ONE);
        int len=bsum.toString().length();
        int[] newd=new int[len];
        BigInteger res;
       for(int j=1;!bsum.equals(BigInteger.ZERO);j++){
            res=bsum.mod(BigInteger.TEN);
            newd[len-j]=res.intValue();
            bsum=bsum.divide(BigInteger.TEN);
            
        }
        return newd;
    }
}

//second way using actual array addition
import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> a=new ArrayList<>();
       int carry=1;
       for(int i=digits.length-1;i>=0;i--){
        if(digits[i]>=9 && carry==1){
            a.add(0);
            carry=1;
        }else{
            a.add(carry+digits[i]);
            carry=0;
        }
       }
       if(carry==1){
        a.add(carry);
       }
      
        Collections.reverse(a);
        int[] res=new int[a.size()];
        for(int i=0;i<a.size();i++){
            res[i]=a.get(i);
        }
      
       return res;
    }
}

/*
Input
digits =[9]
Output:
[1,0]
*/
