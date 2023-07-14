package Sorting;

import java.util.Arrays;

public class JP_01_BubbleSort {
    public static void main(String[] args) {
        int []arr={-1,-2,-3,-4,0};
        System.out.println("Before Sorting:\n"+Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println("After Sorting:\n"+Arrays.toString(arr));
    }
    static void BubbleSort(int []arr){
        boolean swap=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {   //
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap=true;
                }
            }
            if(!swap)
                break;
        }
    }
}
