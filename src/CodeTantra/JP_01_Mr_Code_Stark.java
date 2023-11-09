package CodeTantra;

//Mr. Code Stark went on a space mission and landed on Planet X which uses a different number system.
//Instead of having the least significant digit on the extreme right, they have the least significant digit on the extreme left.
//So, 321 on our planet is 123 on the Planet X.
// Mr. Code Stark wanted to find numbers that are same on both the planet Earth and Planet X. Help him find such numbers.

import java.util.Scanner;

public class JP_01_Mr_Code_Stark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        JP_01_Mr_Code_Stark obj=new JP_01_Mr_Code_Stark();
        System.out.println(obj.find(n));
//        System.out.println(obj.find(n)? "True" : "False");
    }

    public boolean find(int n) {
        int org = n;
        int r;
        int num = 0;
        int m=0;
        while (n != 0) {
            if(n/10==0)
                m=n;
            r = (n % 10);
            num = (num * 10) + r;
            n = n / 10;
        }
        return org == num && ((org%100)/m)!=11;
    }
}
