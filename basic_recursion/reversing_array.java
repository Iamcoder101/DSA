//reversing an array using recursion
class Main {
    public static int reverse(int [] a,int i){
        int temp=a[i];
        a[i]=a[a.length-1-i];
        a[a.length-1-i]=temp;
       if(i==a.length-1-i || i>a.length-1-i){
           return 0;
       }
       reverse(a,i+1);
       return 0;
    }
    public static void main(String[] args) {
       int [] a={1,2,3,0,9,0,5,8};
      reverse(a,0);
      for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
      }
    }
}

