/*

LEET CODE:169
169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109

*/



class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> h=new HashMap<>();
        for(int num:nums){
            h.put(num,(h.getOrDefault(num,0)+1));
        }
        int max=Collections.max(h.values());
        int maxx=0;
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()==max){
                maxx=e.getKey();
            }
        }
        return maxx;
    }
}



//using O(1) space complexity  (Boyer-Moore Voting Algorithm)
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
