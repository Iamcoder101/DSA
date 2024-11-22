/*
26. Remove Duplicates from Sorted Array(LEETCODE 26)

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


*/
class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> indexs=new ArrayList<>();
        int dup=nums[0];
        indexs.add(dup);
        for(int i=0;i<nums.length-1;i++){
           if(dup!=nums[i+1]){
            indexs.add(nums[i+1]);
            dup=nums[i+1];
           }
        }
        int k=indexs.size();
        for(int i=0;i<k;i++){
            nums[i]=indexs.get(i);
        }
        return k; 
    }
}


//DEBUGGING
//0,0,1,1,1,2,2,3,3,4
//dup=0 index(0)=0
//i=0, noh
//i=1, index(1)=1,dup=1
//i=2,noh
//i=3, noh
//i=4, index(2)=2,dup=2
//i=5, noh
//i=6, index(3)=3, dup=3
//i=7, noh
//i=8, index(4)=4,dup=4



//0,0,1,1,1,2,2,3,3,4
//dup=a[0] arr[0]=0
//dup!=a[1] then  dup=a[1] 
//k=arr.length
//for(i=0 to arr.length) nums[i]=arr[i]
