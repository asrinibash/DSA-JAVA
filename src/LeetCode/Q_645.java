package LeetCode;

import java.util.Arrays;

public class Q_645 {
    public static void main(String[] args) {
    int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] arr) {
        int i=0;
        int l;
        while(i<arr.length) {
            l = arr[i] - 1;
            if (arr[i] != arr[l]) {
                Swap(arr,i,l);
            } else
                i++;
        }
        i=0;
        while(i<arr.length){
            if(arr[i]!=(i+1))
                return new int[]{arr[i],i+1};
            else
                i++;
        }
        return new int[]{};
    }
    static void Swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}