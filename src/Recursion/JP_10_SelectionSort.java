package Recursion;

import java.util.Arrays;

public class JP_10_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 7, 9};
        selectionSort(arr, arr.length - 1, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int r, int c,int m) {
        if (r == 0)
            return;
        if (c < r) {
            if (arr[m] < arr[c])
                selectionSort(arr, r, c + 1, c);//here assign m - c
            else
                selectionSort(arr, r, c + 1, m);
        }else {
                int temp = arr[m];
                arr[m] = arr[r-1];
                arr[r-1] = temp;
                selectionSort(arr, r - 1, 0,0);
            }
    }
}
