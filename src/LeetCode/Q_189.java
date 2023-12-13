package LeetCode;

import java.util.Arrays;

public class Q_189 {
    public static void rotate(int[] nums, int k) {
        //step-1-: rotate total array
        for (int i = 0; i < nums.length / 2; i++) {
            swap(nums,i,nums.length-1-i);
        }
        //step-2: rotate in 0-k
        for (int i = 0; i < k/2; i++) {
            swap(nums,i,k-i-1);
        }
        //step-3: rotate in k-length
        for (int i = 0; i < (nums.length-k)/2; i++) {
            swap(nums,i+k,(nums.length-i)-1);
        }
        System.out.println(Arrays.toString(nums));
    }
    private static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,3);
    }
}
