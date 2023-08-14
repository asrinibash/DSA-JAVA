package DSA_Sheet_ApnaCollege;


import java.util.Arrays;

public class JP_01_MinimumAndMaximum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 0, 2, 7, -1};
        minimumAndMaximum(arr);
    }

    static void minimumAndMaximum(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
