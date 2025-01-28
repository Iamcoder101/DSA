/*(LEET CODE 704)
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
*/
//iterative binary search
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}

//recursive binary search
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int index=bi(nums,low,high,target);
        return index;
    }
    static int bi(int nums[],int low, int high,int target){
        if(high>=low){
            int mid=low+(high-low)/2;
             if(target==nums[mid]){
                return mid;
             }
             if(target<nums[mid]){
                return bi(nums,low,mid-1,target);
             }
             return bi(nums,mid+1,high,target);
        }
        return -1;
    }
}
