package Sorting;

import java.util.Arrays;

public class JP_06_QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
       // Arrays.sort(arr);//-->it uses dualPivot QuickSort Approach
    }

    static void quickSort(int[] arr, int low, int hi) {
        if (low >= hi)
            return;
        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, hi);
    }
}
