package DP;

import java.util.Arrays;

public class JP_01_nthFibo_GFG {
    static int helper(int n,int[] dp){
        if(n==1 || n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        int ans=(helper(n-1,dp)+helper(n-2,dp))%1000000007; //adding mod
        dp[n]=ans;
        return ans;
    }
    static int nthFibonacci(int n){
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        dp[0]=0;
        dp[1]=1;
        return helper(n,dp);
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(10));
    }
}
