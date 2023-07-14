package LeetCode;

import java.util.Arrays;

class Q_41 {
    public static void main(String[] args) {
      int[] arr= {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        int i=0;
        int l;
        while(i<arr.length) {
            l = arr[i] - 1;
            if (arr[i]<arr.length && arr[i]>0 && arr[i] != arr[l]) {
                Swap(arr,i,l);
            } else
                i++;
        }
        System.out.println(Arrays.toString(arr));
        i=0;
        while(i<arr.length){
            if(arr[i]!=(i+1)){
                return i+1;
            }
            i++;
        }
          return i+1;
    }
    static void Swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}