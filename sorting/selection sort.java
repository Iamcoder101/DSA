/* selection sorting:
we search for the lowest element and arrange it to the proper location. We swap the current element with the next lowest number.

problem: sort the given elements in ascending and descending order using selection sort
*/

//java code for ascending order using selection sort
public class Main {
    public static void main(String[] args) {
        int arr[]={3200,3,60,35,2,45,5};
       
      for(int i=0;i<arr.length;i++){
          int index=i;
          for(int j=i+1;j<arr.length;j++){
              if(arr[j]<arr[index]){
                  index=j;
              }
          }
          int temp=arr[i];
          arr[i]=arr[index];
          arr[index]=temp;
      }
       
        System.out.print("ascending order sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            }
}

//output:ascending order sorted array is: 2 3 5 35 45 60 3200 

// code for descending order sorting using selection sort
public class Main {
    public static void main(String[] args) {
        int arr[]={3200,3,60,35,2,45,5};
       
      for(int i=0;i<arr.length;i++){
          int index=i;
          for(int j=i+1;j<arr.length;j++){
              if(arr[j]>arr[index]){
                  index=j;
              }
          }
          int temp=arr[i];
          arr[i]=arr[index];
          arr[index]=temp;
      }
       
        System.out.print("descending order sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            }
}

//output:descending order sorted array is: 3200 60 45 35 5 3 2 
