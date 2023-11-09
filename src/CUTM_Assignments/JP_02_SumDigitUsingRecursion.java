package CUTM_Assignments;

import java.util.Scanner;

public class JP_02_SumDigitUsingRecursion {

    static int sum(int num) {
        int summ = 0;
        if (num < 10) {
            return num;
        }
        int n = num % 10;
        summ += sum(num / 10);
        summ += n;
        return summ;

    }

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner n = new Scanner(System.in);
        num1 = n.nextInt();
        System.out.println(sum(num1));
    }
}