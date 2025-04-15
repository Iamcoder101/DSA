/*
LEET CODE 560
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2

*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=nums.length-1;
        int check=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            check=0;
            for(int j=i;j<=l;j++){
               check=check+nums[j];
               if(check==k){
                c=c+1;
            }
            }
        }
        return c;
    }
}


//efficient code 
class Solution {
    private static final int NULL = Integer.MIN_VALUE, MIXER = 0x9E3779BA;
    public static int subarraySum(int[] nums, final int k){
        final int mask = mask(nums.length);
        final int[] hashtable = new int[mask + 1];
        int res = 0, sum = 0, zeros = 1;
        for(final int n : nums){
            sum += n;
            final int diff = sum - k;
            if(diff != 0){
                int i = diff * MIXER & mask;
                while(true){
                    final int key = hashtable[i];
                    if(key == 0) break;
                    if(key == diff){
                        res += hashtable[i+1];
                        break;
                    }
                    i = i + 2 & mask;
                }
            }else{
            res += zeros;
            }
            if(sum != 0){
                int i = sum * MIXER & mask;
                while(true){
                    final int key = hashtable[i];
                    if(key == 0){
                        hashtable[i] = sum;
                        hashtable[i + 1] = 1;
                        break;
                    }
                    if(key == sum){
                        hashtable[i+1]++;
                        break;
                    }
                    i = i + 2 & mask;
                }
            }else{
            zeros++;
        }
    }
    return res;
    }
    public static int mask(int n){
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >>8;
        return (n << 1) | 31;
    }
}
