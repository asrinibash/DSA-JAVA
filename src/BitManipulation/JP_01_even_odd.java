package BitManipulation;

public class JP_01_even_odd {
    public static void main(String[] args) {
        int n = 324;
        System.out.println(isOdd(n));
    }
    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
