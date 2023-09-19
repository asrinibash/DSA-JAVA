package Arrays;

import java.util.Arrays;

//GFG-Move all negative numbers to beginning and positive to end with constant extra space
//we can solve using two pointer method left and right
public class JP_01_Positive_Negative {
    public static void main(String[] args) {
        int[] arr={ -12, 11, -13, -5, 6, -7, 5, -3, -6};
        Exchange(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Exchange(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]>=0&&arr[right]<0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]<0&&arr[right]<=0){
                left++;
            }
            else{
                right--;
            }
        }
    }
    private static void swap(int[] arr,int left,int right){
         int temp=arr[left];
         arr[left]=arr[right];
         arr[right]=temp;

    }
}
