/*LEET CODE:189
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

*/

class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k = k % len; 
        if (k == 0) return;
      rev(nums,0,len-1);
      rev(nums,0,k-1);
      rev(nums,k,len-1);
      }
      private void rev(int[] nums,int s,int l){
        while(s<l){
             int temp = nums[s];
            nums[s] = nums[l];
            nums[l] = temp;
            s++;
            l--;
        }
      }
}

/*
Input
nums =
[1,2,3,4,5,6,7]
k =
3
Output
[5,6,7,1,2,3,4]
*/
