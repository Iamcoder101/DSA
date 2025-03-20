/*
HACKER RANK

Number of ways to reach a cell in a matrix ,if only left and down directions are allowed.entry point is [0,0]Input Format

read cell coordinates for ex

Constraints

1<=x<=1000 1<=y<=1000

Output Format

print the desired output

Sample Input 0

1 1
Sample Output 0

2
Sample Input 1

3 3
Sample Output 1

20
Sample Input 2

4 4
Sample Output 2

70


*/



import java.io.*;
import java.util.*;

public class Solution {
    public static int check(int r, int col){
        int dp[][]=new int[r+1][col+1];
        //dp[0][0]=0;
        for(int i=0;i<=r;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<=col;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=col;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        
        
        
        return dp[r][col];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int col=sc.nextInt();
        System.out.println(check(r,col));
    }
}
