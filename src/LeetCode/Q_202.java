package LeetCode;

public class Q_202 {
    public boolean isHappy(int n){
        //solving linkedList fast and slow pointer approach
        int slow=n;
        int fast=n;
        do{
            slow=sumSquare(slow);
            fast=sumSquare(sumSquare(fast));
        }while(slow!=fast);
        return slow == 1;
    }
    private  int sumSquare(int n){
        int rem;
        int sum=0;
        while(n>0){
            rem=n%10;
           n=n/10;
           sum+=(rem*rem);
        }
        return sum;
    }


}
