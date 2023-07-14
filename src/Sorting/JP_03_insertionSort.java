package Sorting;

import java.util.Arrays;

public class JP_03_insertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,7,1};
        System.out.println("Before Sorting:\n" + Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("After Sorting:\n" + Arrays.toString(arr));
    }

    static void InsertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp=arr[i];
            int j=i-1;
           while( j>=0 && arr[j]>temp){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=temp;
        }
    }

}

