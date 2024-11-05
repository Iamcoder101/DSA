/*
You are given an array of integers arr . Your task is to reverse the given array.

Examples:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Explanation: The elements of the array are 1 2 3 4. After reversing the array, the first element goes to the last position,
the second element goes to the second last position and so on. Hence, the answer is 4 3 2 1
*/
class Solution {
    public void reverseArray(int arr[]) {
       int n=arr.length;
        int temp=0;
     for(int i=0;i<n-i;i++){
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            if(i>=(n-1)){
                break;
            }
        }
    }
}

/*
For Input: 
1 2 3 4
Your Output: 
4 3 2 1
*/
