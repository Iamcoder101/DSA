/*(GEEKS FOR GEEKS)
Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
Examples:

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: 1 2 3 4 5 6 7
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
*/
  class Solution {
    
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
       // ArrayList c=new ArrayList<>();
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<a.length;i++){
          set.add(a[i]);
      }
      for(int i=0;i<b.length;i++){
          set.add(b[i]);
      }
      ArrayList<Integer> c=new ArrayList<>(set);
      Collections.sort(c);
      return c;
    }
}
