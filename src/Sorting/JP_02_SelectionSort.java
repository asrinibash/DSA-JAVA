package Sorting;

import java.util.Arrays;

public class JP_02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4, 0};
        System.out.println("Before Sorting:\n" + Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println("After Sorting:\n" + Arrays.toString(arr));
    }

    static void SelectionSort(int[] arr) {
        int maxValue;
        for (int i = 0; i < arr.length; i++) {
            maxValue = i;

            for (int j = 0; j < arr.length; j++) {

                if (arr[maxValue] > arr[j])
                    maxValue = j;

            }
            int temp = arr[maxValue];
            arr[maxValue] = arr[i];
            arr[i] = temp;
        }

    }
}
