package BitManipulation;

public class JP_05_FindOutPowerOf2 {
    public static void main(String[] args) {
        int n = 32;
        int ans = n & (n-1);
        if (ans == 0)
            System.out.println(n + " is  a power of 2");
        else
            System.out.println(n + " is not a power of 2");
    }
}
