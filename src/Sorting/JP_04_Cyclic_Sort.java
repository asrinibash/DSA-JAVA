package Sorting;

import java.util.Arrays;

public class JP_04_Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSort(int[] arr){
        int i=0;
        int CorrectIndex;
        while(i< arr.length){
            CorrectIndex=arr[i]-1;
            if(arr[i]!=arr[CorrectIndex])
                Swap(arr,CorrectIndex,i);
            else
                i++;
        }
    }

    static void Swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
