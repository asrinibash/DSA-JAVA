package BitManipulation;

public class JP_09_Prime_No {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        int c = 1;
        for (c = 2; (c * c) <= n; c++) {   //-->optimised approach
            if (n % c == 0)
                return false;
        }
        return true;
    }
}
