/*

  LEET CODE :540
  Single Element in a Sorted Array
  You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105

*/


//O(logn)
class Solution {
    public int singleNonDuplicate(int[] nums) {
       int low=0;
       int high=nums.length-1;
       while(low<high){
        int mid=(low+high)/2;
        if(mid%2!=0){
            mid--;
        }
           
            if(nums[mid]!=nums[mid+1]){
                high=mid;
            }else{
                low=low+2;
            }
         }
       
       return nums[low];
    }
}
//O(n)
import java.util.HashMap;
class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int k :nums){
            if(h.containsKey(k)){
                h.replace(k,h.get(k)+1);
            }else{
                h.put(k,1);
            }
        }
        for (var entry : h.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;

    }
}
