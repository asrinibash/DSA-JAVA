package Recursion;

public class JP_02_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(ProductDigit(1245));
    }

    public static int sumDigit(int i) {
        if (i == 0) {
            return 0;
        }
        return (i % 10) + sumDigit(i / 10);
    }

    public static int ProductDigit(int i) {
        if (i % 10 == i) {
            return 1;
        }
        return (i % 10) * ProductDigit(i / 10);
    }
}
