/*(GEEKS FOR GEEKS)
Given an array, arr[] sorted in ascending order and an integer k. Return true if k is present in the array, otherwise, false.

Examples:

Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: true
Exlpanation: Since, 6 is present in the array at index 4 (0-based indexing), output is true.
*/
class Solution {
    static boolean searchInSorted(int arr[], int k) {
        int len=arr.length;
        int middle=arr[(len)/2];
        if(k<middle){
            for(int i=0;i<(len/2);i++){
              if(arr[i]==k){
                  return true;
              }
            }     
        }else if(k>middle){
            for(int i=(len/2)+1;i<len;i++){
                if(arr[i]==k){
                  return true;
                }
                }
              }else{
                  if(middle==k){
                      return true;
                  }else{
                      return false;
                  }
              }
              return false;
        }
    }
