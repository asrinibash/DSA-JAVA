package Sorting;

import java.util.Arrays;

public class JP_05_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 4, 9, 3, 6};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;

    }

    //Merge Sort Inplace--> it changes original array
    static void mergeSortInplace(int[] arr, int s, int e) {
        if (e - s == 1)
            return;

        int mid = (s + e) / 2;

        mergeSortInplace(arr, 0, mid);
        mergeSortInplace(arr, mid,e);

        mergeInplace(arr, s, mid, e);
    }

    static void mergeInplace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j]; 
            j++;
            k++;
        }

        System.arraycopy(mix, 0, arr,  s+0, mix.length);
    }

}
