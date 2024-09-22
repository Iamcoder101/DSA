/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example array[1,3,5,7,9]
The minimum sum is 1+3+5+7=16 and the maximum sum is3+5+7+9=24 .
The code prints 16 24 

Input Format:
A single line of five space-separated integers.

output format:
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
 Sample Input:
1 2 3 4 5
Sample Output:
10 14
  */
//solution 1(without any any funtions)
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long array[]=long int[5];
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
        long sum[]=new long[array.length];
       
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(j==i){
                 continue;
                }else{
                    sum[i]+=array[j];
                }
            }
        }
        long min=sum[0];
        long max=sum[0];
        for(int i=0;i<sum.length;i++){
            if(min>sum[i]){
                min=sum[i];
            }
            if(max<sum[i]){
                max=sum[i];
            }
        }
        System.out.println(min+" "+max);
    }
}

//solution 2 with class and object(oops)
import java.util.*;
class minMaxSum{
    void minmaxsum(long array[]){
        long sum[]=new long[array.length];
       
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(j==i){
                 continue;
                }else{
                    sum[i]+=array[j];
                }
            }
        }
        long min=sum[0];
        long max=sum[0];
        for(int i=0;i<sum.length;i++){
            if(min>sum[i]){
                min=sum[i];
            }
            if(max<sum[i]){
                max=sum[i];
            }
        }
        System.out.println(min+" "+max);
    }
    
    }
    public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long array[]=new long[5];
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
        minMaxSum obj= new minMaxSum();
        obj.minmaxsum(array);
    }
}
