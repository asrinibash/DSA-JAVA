package Interview;

public class JP_01_fibonacci {
     int[] dp=new int[100];
     public int fibonaciusigRecursive(int n){
        if (n==1 || n==0){
            return n;
        }
        if(dp[n]!=0) return dp[n];
        return dp[n]=fibonaciusigRecursive(n-2)+fibonaciusigRecursive(n-1);

    }

    public void fiboIterative(int n){
         int a=0;
         int b=1;
        System.out.println(0);
        System.out.println(1);
        for (int i = 2; i < n; i++) {
            int next=a+b;
            int temp=a;
            a=b;
            b=next;
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        JP_01_fibonacci obj=new JP_01_fibonacci();
        int n=7;
       obj.fiboIterative(n);
//        for (int i = 0; i < n; i++) {
//            System.out.println(obj.fibonaciusigRecursive(i));
//        }
    }
}
