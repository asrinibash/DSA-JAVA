package Recursion;

public class JP_03_ReverseNum {
    static int rNum = 0;

    public static void reverse(int n) {
        if (n == 0)
            return;

        rNum = (n % 10) + (rNum * 10);
        reverse(n / 10);
    }

    // 2nd Approach-->it returns int
    static int reverse1(int n) {
        if (n % 10 == n)
            return n;
        int digits = (int) (Math.log(n) - 1);
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n)
            return n;
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1) + helper(n / 10, digits - 1));
    }

    static boolean palindrom(int n) {
        return (n == reverse1(n));
    }

    public static void main(String[] args) {
        System.out.println(reverse1(1234));
    }
}
