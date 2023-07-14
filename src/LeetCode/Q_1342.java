package LeetCode;

public class Q_1342 {
    public static void main(String[] args) {
        int n=304010;
        System.out.println(numberOfSteps(n));
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    public static int helper(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
