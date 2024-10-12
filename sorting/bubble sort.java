/* bubble sort:array is traversed from first element to last element. Here, current element is compared with the next element. If current element is greater than the next element, it is swapped.
problem:sort 3,60,35,2,45,320,5 in ascending and descending order
*/
// ascending order bubbble sort program in java
public class Main {
    public static void main(String[] args) {
        int arr[]={3,60,35,2,45,320,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                //int temp=arr[j];
                if(arr[j]>arr[j+1]){
                   int temp= arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        System.out.print("ascending order sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            }
}
//output:ascending order sorted array is: 2 3 5 35 45 60 320 


// descending order bubble sort program
public class Main {
    public static void main(String[] args) {
        int arr[]={3,60,35,2,45,320,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                //int temp=arr[j];
                if(arr[j]<arr[j+1]){     //condition reversed 
                   int temp= arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        System.out.print("descending order sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            }
}

//output:descending order sorted array is: 320 60 45 35 5 3 2 
